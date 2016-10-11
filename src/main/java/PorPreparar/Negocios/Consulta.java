package PorPreparar.Negocios;

import java.io.FileNotFoundException;
import java.util.*;

import Negocios.Pregunta;

public class Consulta {

    private ArrayList<String> respuestas = new ArrayList<>();
    private String ID;
    private Pregunta pregunta;
    private ArrayList<String> respuestasIncorrectas;

    public Consulta(String pPregunta) throws FileNotFoundException, InterruptedException {
	pregunta = new Pregunta();
	setPregunta(pPregunta);
    }

    public String getPregunta() {
	return pregunta.getPregunta();
    }

    public ArrayList<String> getRespuestas() {
	return respuestas;
    }

    public ArrayList<String> getRespuestasIncorrectas() {
	return respuestasIncorrectas;
    }

    private void setPregunta(String pPregunta) throws FileNotFoundException, InterruptedException {
	if (pPregunta == null)
	    pregunta.setPregunta();
	else
	    pregunta.setPregunta(pPregunta);
    }

    private void buscarID() {
    }

    public String imprimirCorrectas() {
	String resultado;
	resultado = pregunta.getPregunta() + " \n";
	for (int i = 0; i < respuestas.size(); i++) {
	    resultado = resultado + respuestas.get(i) + " \n";
	}
	return resultado;
    }

    public String imprimirIncorrectas() {
	String resultado;
	resultado = pregunta.getPregunta() + " \n";
	for (int i = 0; i < respuestasIncorrectas.size(); i++) {
	    resultado = resultado + respuestasIncorrectas.get(i) + " \n";
	}
	return resultado;
    }

    public void agregarRespuesta(String pRespuesta) {
	respuestas.add(pRespuesta);
    }
}