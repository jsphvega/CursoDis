package Controlador;

import java.util.*;

import DTO.DTOArchivoCategoria;
import DTO.DTOArchivoConversacion;
import DTO.DTOEntrenamientoTutor;
import DTO.DTORespuestaSatisfactoria;
import Negocios.Consulta;

public class Controlador {

    public Controlador() {
    }

    public String imprimir() {
	return "prueba";
    }

    public void traducirRespuestas(Consulta pConsulta) {
	// TODO implement here
    }

    public void agregarRespuestasPreguntas(DTOEntrenamientoTutor pEntrenamiento) {
	// TODO implement here
    }

    public void grabarAudio() {
	// TODO implement here
    }

    public String obtenerRespuestas(Consulta pConsulta) {
	// TODO implement here
	return "";
    }

    public void crearDocumentoConversacion(DTOArchivoConversacion pArchivoConversacion) {
	// TODO implement here
    }

    public void guardarIncorrectas(ArrayList<Consulta> pIncorrectas) {
	// TODO implement here
    }

    public void crearDocumentoCategoria(DTOArchivoCategoria pArchivoCategoria) {
	// TODO implement here
    }

    public Boolean verificarRespuesta(DTORespuestaSatisfactoria pRespuesta) {
	// TODO implement here
	return false;
    }

    public String prueba(){
	return "Si";
    }
    
}