package DTO;

/**
 * DTO que recibe los parametros de pregunta de la vista.
 * 
 * @author ChuckyBueno
 * @since 11-Octubre-2016
 */
public class DTOPregunta {

    private String pregunta;

    /**
     * Obtiene la pregunta
     * 
     * @return La pregunta
     */
    public String getPregunta() {
	return pregunta;
    }

    /**
     * Actualiza la pregunta
     * 
     * @param pPregunta
     *            LA nueva pregunta
     */
    public void setPregunta(String pPregunta) {
	this.pregunta = pPregunta;
    }

}