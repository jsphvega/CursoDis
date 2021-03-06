package Negocios;

import java.util.ArrayList;

import Negocios.Pregunta;

public class Consulta {

    private ArrayList<String> respuestas = new ArrayList<>();
    private Pregunta pregunta;
    private ArrayList<String> respuestasIncorrectas;

    public Consulta(String pPregunta) {
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

    private void setPregunta(String pPregunta){
	if (pPregunta == null)
	    pregunta.setPregunta();
	else
	    pregunta.setPregunta(pPregunta);
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