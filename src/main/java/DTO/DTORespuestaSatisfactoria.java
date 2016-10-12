package DTO;

/** DTO que recibe los parametros de la respuesta satisfactoria.
 * @author ChuckyBueno
 * @since 11-Octubre-2016
 */
public class DTORespuestaSatisfactoria {
  private boolean respuesta;

    public DTORespuestaSatisfactoria() {
    }

    /**
     * @return
     */
    public boolean getRespuesta() {
        return respuesta;
    }

    /**
     * @param pRespuesta
     */
    public void setRespuesta(boolean pRespuesta) {
       this.respuesta=pRespuesta;
    }

}