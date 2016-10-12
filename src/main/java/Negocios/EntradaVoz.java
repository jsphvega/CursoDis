package Negocios;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.TargetDataLine;

import Negocios.Pregunta;
import Integracion.VozATexto;

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
	float sFrecuencia = 16000;
	int sTamanoBits = 8;
	int sCanal = 2;
	boolean sActivo = true;
	boolean sEndian = true;

	// Se crea y se retorna la configuracion
	AudioFormat sFormato = new AudioFormat(sFrecuencia, sTamanoBits, sCanal, sActivo, sEndian);
	return sFormato;
    }

    /**
     * Metodo que captura el sonido y graba dentro de in archivo WAV
     */
    private void iniciarGrabacion() {
	try {
	    AudioFormat sFormato = getFormatoAudio();
	    DataLine.Info sInformacion = new DataLine.Info(TargetDataLine.class, sFormato);

	    // Revisa si el sistema soporta la linea de datos
	    if (!AudioSystem.isLineSupported(sInformacion)) {
		System.exit(0);
	    }

	    // Inicia la grabacion
	    lineaGrabacion = (TargetDataLine) AudioSystem.getLine(sInformacion);
	    lineaGrabacion.open(sFormato);
	    lineaGrabacion.start();

	    AudioInputStream sEntradaAudio = new AudioInputStream(lineaGrabacion);
	    AudioSystem.write(sEntradaAudio, tipoArchivo, archivo);

	} catch (LineUnavailableException | IOException e) {
	    e.printStackTrace();
	}
    }

    /**
     * Metodo que cierra la linea de grabacion
     */
    private void finalizarGrabacion() {
	lineaGrabacion.stop();
	lineaGrabacion.close();
    }

    /**
     * Metodo que se encarga de ejecutar la linea de grabacion del proyecto
     */
    private void grabarPregunta() {
	tipoArchivo = AudioFileFormat.Type.WAVE;
	archivo = new File("src/files/RecordAudio.wav");

	// Crea lel nuevo hilio que mantiene el tiempo dicho para detenerse
	Thread sDetector = new Thread(new Runnable() {
	    public void run() {
		try {
		    Thread.sleep(TIEMPO);
		} catch (InterruptedException ex) {
		    ex.printStackTrace();
		}
		finalizarGrabacion();
	    }
	});

	// Se inicia el hilo y la grabacion
	sDetector.start();
	iniciarGrabacion();
    }

    /**
     * Metodo que se encarga de convertir el audio en una cadena de texto
     * 
     * @return Una cadena de texto
     * @throws FileNotFoundException
     * @throws InterruptedException
     */
    public String procesarPregunta() {
	grabarPregunta();

	VozATexto prueba = new VozATexto();
	prueba.autenticarServicio();

	return prueba.procesarAudio();
    }
}