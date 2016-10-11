package PorPreparar.Integracion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import com.ibm.watson.developer_cloud.http.HttpMediaType;
import com.ibm.watson.developer_cloud.speech_to_text.v1.SpeechToText;
import com.ibm.watson.developer_cloud.speech_to_text.v1.model.RecognizeOptions;
import com.ibm.watson.developer_cloud.speech_to_text.v1.model.SpeechResults;
import com.ibm.watson.developer_cloud.speech_to_text.v1.websocket.BaseRecognizeCallback;

import Integracion.ConexionWatson;

public class VozATexto implements ConexionWatson {

    private static String USUARIO;
    private static String CONTRASENA;
    private static CountDownLatch lock;
    private SpeechToText servicio;
    private String pregunta;
    private FileInputStream audio;
    private static final String pathAudio = "src/Files/RecordAudio.wav";

    public VozATexto() {
	servicio = new SpeechToText();
    }

    public void autenticarServicio() {
	servicio.setUsernameAndPassword(USUARIO, CONTRASENA);
    }

    public void buscarAudio() throws FileNotFoundException {
	audio = new FileInputStream(pathAudio);
    }

    public String procesarAudio() throws InterruptedException {
	RecognizeOptions options = new RecognizeOptions.Builder().continuous(true).interimResults(true)
		.contentType(HttpMediaType.AUDIO_WAV).build();

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
    }
}