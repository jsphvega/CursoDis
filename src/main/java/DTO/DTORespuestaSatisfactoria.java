package DTO;

/**
 * DTO que recibe los parametros de la respuesta satisfactoria.
 * 
 * @author ChuckyBueno
 * @since 11-Octubre-2016
 */
public class DTORespuestaSatisfactoria {

    private boolean respuesta;

    /**
     * Metodo que devuelve la respuesta
     * 
     * @return La respuesta
     */
    public boolean getRespuesta() {
	return respuesta;
    }

    /**
     * Metodo que actualiza la respuesta
     * 
     * @param pRespuesta
     *            La nueva respuesta
     */
    public void setRespuesta(boolean pRespuesta) {
	this.respuesta = pRespuesta;
    }

}