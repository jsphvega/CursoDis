package PorPreparar.Integracion;

import java.io.FileInputStream;
import java.util.concurrent.CountDownLatch;

import Integracion.ConexionWatson;

public class VozATexto implements ConexionWatson {

    private static String USUARIO;
    private static String CONTRASENA;
    private static CountDownLatch lock;
    //private SpeechToText servicio;
    private String pregunta;
    private FileInputStream audio;

    public VozATexto() {
	// TODO implement here
    }

    public void autenticarServicio() {
	// TODO implement here
    }

    public void buscarAudio() {
	// TODO implement here
    }

    public String procesarAudio() {
	// TODO implement here
	return "";
    }
}