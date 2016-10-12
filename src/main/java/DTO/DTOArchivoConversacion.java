package DTO;

/**
 * 
 */
public class DTOArchivoConversacion {

  private String tipoArchivo;
    
  public DTOArchivoConversacion() {
    }

    /**
     * @return
     */
    public String getTipo() {
        return tipoArchivo;
    }

    /**
     * @param pTipo 
     * @return
     */
    public void setTipo(String pTipo) {
       this.tipoArchivo=pTipo;
    }

}