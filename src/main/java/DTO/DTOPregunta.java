package DTO;

/** DTO que recibe los parametros de pregunta de la vista.
 * @author ChuckyBueno
 * @since 11-Octubre-2016
 */


public class DTOPregunta {
    private String pregunta;
    
    public DTOPregunta() {
       
    }

    /**
     * @return
     */
    public String getPregunta() {    
        return pregunta;
    }

    /**
     * @param pPregunta 
     * @return
     */
    public void setPregunta(String pPregunta) {
        this.pregunta=pPregunta;
    }

}