package DTO;

/**
 * DTO que recibe los parametros de pregunta de la vista.
 * 
 * @author ChuckyBueno
 * @since 11-Octubre-2016
 */
public class DTOArchivoCategoria {

    private String categoria;
    private String tipoArchivo;
    private String curso;

    public String getCategoria() {
	return categoria;
    }

    public String getTipoArchivo() {
	return tipoArchivo;
    }

    public void setCategoria(String pCategoria) {
	this.categoria = pCategoria;
    }

    public void setTipoArchivo(String pTipoArchivo) {
	this.tipoArchivo = pTipoArchivo;
    }

    public String getCurso() {
	return curso;
    }

    public void setCurso(String pCurso) {
	this.curso = pCurso;
    }
}