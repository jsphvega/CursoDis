package Controlador;

import java.util.*;

import DTO.DTOArchivoCategoria;
import DTO.DTOArchivoConversacion;
import DTO.DTOEntrenamientoTutor;
import DTO.DTORespuestaSatisfactoria;
import PorPreparar.Negocios.Consulta;

/**
 * 
 */
public class Controlador {

    /**
     * Default constructor
     */
    public Controlador() {
    }


    /**
     * @param pConsulta 
     * @return
     */
    public void traducirRespuestas(Consulta pConsulta) {
        // TODO implement here
    }

    /**
     * @param pEntrenamiento 
     * @return
     */
    public void agregarRespuestasPreguntas(DTOEntrenamientoTutor pEntrenamiento) {
        // TODO implement here
    }

    /**
     * @return
     */
    public void grabarAudio() {
        // TODO implement here
    }

    /**
     * @param pConsulta 
     * @return
     */
    public String obtenerRespuestas(Consulta pConsulta) {
        // TODO implement here
        return "";
    }

    /**
     * @param pArchivoConversacion 
     * @return
     */
    public void crearDocumentoConversacion(DTOArchivoConversacion pArchivoConversacion) {
        // TODO implement here
    }

    /**
     * @param pIncorrectas 
     * @return
     */
    public void guardarIncorrectas(ArrayList<Consulta> pIncorrectas) {
        // TODO implement here
    }

    /**
     * @param pArchivoCategoria 
     * @return
     */
    public void crearDocumentoCategoria(DTOArchivoCategoria pArchivoCategoria) {
        // TODO implement here
    }

    /**
     * @param pRespuesta 
     * @return
     */
    public Boolean verificarRespuesta(DTORespuestaSatisfactoria pRespuesta) {
        // TODO implement here
        return false;
    }

}