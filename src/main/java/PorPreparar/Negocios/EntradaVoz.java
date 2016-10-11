package PorPreparar.Negocios;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.TargetDataLine;

import Negocios.Pregunta;

/**
 * Clase que se encarga de ejecutar el microfono para introducir la pregunta via
 * sonido, y de convertirla a modo texto
 * 
 * @author ChuckyBueno
 * @since 11-Octubre-2016
 */
public class EntradaVoz extends Pregunta {

    private static final long TIEMPO = 6000;
    private File archivo;
    private AudioFileFormat.Type tipoArchivo;
    private TargetDataLine lineaGrabacion;

    /**
     * Metodo que define el formato del audio requerido
     */
    private AudioFormat getFormatoAudio() {
	// Atributos de configuracion
	float sampleRate = 16000;
	int sampleSizeInBits = 8;
	int channels = 2;
	boolean signed = true;
	boolean bigEndian = true;

	// Se crea y se retorna la configuracion
	AudioFormat format = new AudioFormat(sampleRate, sampleSizeInBits, channels, signed, bigEndian);
	return format;
    }

    /**
     * Metodo que captura el sonido y graba dentro de in archivo WAV
     */
    private void iniciarGrabacion() {
	try {
	    AudioFormat format = getFormatoAudio();
	    DataLine.Info info = new DataLine.Info(TargetDataLine.class, format);

	    // revisa si el sistema soporta la linea de datos
	    if (!AudioSystem.isLineSupported(info)) {
		System.exit(0);
	    }
	    
	    //Inicia la grabacion
	    lineaGrabacion = (TargetDataLine) AudioSystem.getLine(info);
	    lineaGrabacion.open(format);
	    lineaGrabacion.start();

	    System.out.println("Start capturing...");

	    AudioInputStream ais = new AudioInputStream(lineaGrabacion);

	    System.out.println("Start recording...");

	    // start recording
	    AudioSystem.write(ais, tipoArchivo, archivo);

	} catch (LineUnavailableException ex) {
	    ex.printStackTrace();
	} catch (IOException ioe) {
	    ioe.printStackTrace();
	}
    }

    /**
     * Closes the target data line to finish capturing and recording
     */
    void finish() {
	lineaGrabacion.stop();
	lineaGrabacion.close();
	System.out.println("Finished");
    }

    /**
     * Entry to run the program
     */
    public void ejecutar() {
	tipoArchivo = AudioFileFormat.Type.WAVE;
	archivo = new File("C:/Users/jsphvega/Downloads/RecordAudio.wav");

	// creates a new thread that waits for a specified
	// of time before stopping
	Thread stopper = new Thread(new Runnable() {
	    public void run() {
		try {
		    Thread.sleep(TIEMPO);
		} catch (InterruptedException ex) {
		    ex.printStackTrace();
		}
		finish();
	    }
	});

	stopper.start();

	// start recording
	iniciarGrabacion();
    }

    public static void main(String[] args) {
	EntradaVoz hjh = new EntradaVoz();
	hjh.ejecutar();
    }

}