package Integracion;

import java.io.FileInputStream;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import com.ibm.watson.developer_cloud.http.HttpMediaType;
import com.ibm.watson.developer_cloud.speech_to_text.v1.SpeechToText;
import com.ibm.watson.developer_cloud.speech_to_text.v1.model.RecognizeOptions;
import com.ibm.watson.developer_cloud.speech_to_text.v1.model.SpeechResults;
import com.ibm.watson.developer_cloud.speech_to_text.v1.websocket.BaseRecognizeCallback;

import Integracion.ConexionWatson;

/**
 * Esta clase permite gestionar la conversion de un archivo de audio a texto
 * 
 * @author ChuckyBueno
 * @since 11-Octubre-2016
 */
public class VozATexto implements ConexionWatson {

    private final static String USUARIO = "b006954a-fc48-445d-a4bb-1aa7a2840a9b";
    private final static String CONTRASENA = "PskeMLKQuqfL";
    private static CountDownLatch lock = new CountDownLatch(1);
    private static SpeechToText servicio;
    private String pregunta;
    private FileInputStream audio;

    /**
     * Metodo cosntructor de la clase
     */
    public VozATexto() {
	servicio = new SpeechToText();
    }

    /**
     * Metodo que permite autenticar el servicio Voz a Texto
     */
    public void autenticarServicio() {
	servicio.setUsernameAndPassword(USUARIO, CONTRASENA);
    }

    /**
     * Metodo que busca el audio en una direccion
     */
    private boolean buscarAudio() {
	try {
	    audio = new FileInputStream("src/Files/RecordAudio.wav");
	    return true;
	} catch (Exception e) {
	    return false;
	}
    }

    /**
     * Transcribe el audio a texto
     * 
     * @return la pregunta en texto plano
     */
    public String procesarAudio() {
	if (buscarAudio()) {
	    try {
		RecognizeOptions options = new RecognizeOptions.Builder().model("es-ES_BroadbandModel").continuous(true)
			.interimResults(true).contentType(HttpMediaType.AUDIO_WAV).build();

		servicio.recognizeUsingWebSocket(audio, options, new BaseRecognizeCallback() {
		    @Override
		    public void onTranscription(SpeechResults speechResults) {
			pregunta = speechResults.getResults().get(0).getAlternatives().get(0).getTranscript();
		    }

		    @Override
		    public void onDisconnected() {
			lock.countDown();
		    }
		});

		lock.await(1, TimeUnit.MINUTES);

		return pregunta;
	    } catch (InterruptedException e) {
		return "";
	    }

	} else
	    return "";
    }
}