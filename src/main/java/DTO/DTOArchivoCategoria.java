package DTO;

/** DTO que recibe los parametros de pregunta de la vista.
 * @author ChuckyBueno
 * @since 11-Octubre-2016
 */
public class DTOArchivoCategoria {
 
    private String categoria;
    private String tipoArchivo;
    private String curso;
    public DTOArchivoCategoria() {
    }


    /**
     * @return
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @return
     */
    public String getTipoArchivo() {
        
        return tipoArchivo;
    }

    /**
     * @param pCategoria 
     * @return
     */
    public void setCategoria(String pCategoria) {
      this.categoria=pCategoria;
    }

    /**
     * @param pTipoArchivo 
     * @return
     */
    public void setTipoArchivo(String pTipoArchivo) {
        this.tipoArchivo= pTipoArchivo;
    }

    /**
     * @return
     */
    public String getCurso() {
        return curso;
    }

    /**
     * @param pCurso 
     * @return
     */
    public void setCurso(String pCurso) {
        this.curso=pCurso;
    }

}