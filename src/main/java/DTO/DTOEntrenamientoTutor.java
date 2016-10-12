package DTO;

/**
 * DTO que recibe los parametros de pregunta y respuesta de la vista que se
 * desea agregar al tutor.
 * 
 * @author ChuckyBueno
 * @since 11-Octubre-2016
 */

public class DTOEntrenamientoTutor {
    
    private String pregunta;
    private String respuesta;

    public String getPregunta() {
	return pregunta;
    }

    public String getRespuesta() {
	return respuesta;
    }

    public void setPregunta(String pPregunta) {
	this.pregunta = pPregunta;
    }

    public void setRespuesta(String pRespuesta) {
	this.respuesta = pRespuesta;
    }

}