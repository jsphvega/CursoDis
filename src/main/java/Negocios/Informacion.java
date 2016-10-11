package Negocios;

/**
 * Clase que se encarga de almacenar las respuestas obtenidas del servicio
 * 
 * @author ChuckyBueno
 * @since 11-Octubre-2016
 */
public class Informacion {

    private int id;
    private String categoria;
    private String titulo;
    private String descripcion;

    /**
     * Método constructor de la clase
     * 
     * @param pID
     *            El identificador de la consulta
     * @param pCategoria
     *            La categoria a la que pertenece la descripcion
     * @param pTitulo
     *            El titulo del documento
     * @param pDescripcion
     *            Un resumen del concepto requerido
     */
    public Informacion(String pID, String pCategoria, String pTitulo, String pDescripcion) {
	id = Integer.parseInt(pID);
	categoria = pCategoria;
	titulo = pTitulo;
	descripcion = pDescripcion;
    }

    /**
     * Metodo que retorna el identificador del documento en el servicio
     * 
     * @return el ID del documento
     */
    public int getId() {
	return id;
    }

    /**
     * Metodo que retorna la categoria del documento en el servicio
     * 
     * @return la categoria del documento
     */
    public String getCategoria() {
	return categoria;
    }

    /**
     * Metodo que retorna el titulo del documento en el servicio
     * 
     * @return el titulo del documento
     */
    public String getTitulo() {
	return titulo;
    }

    /**
     * Metodo que retorna la descripcion del documento en el servicio
     * 
     * @return la descripcion del documento
     */
    public String getDescripcion() {
	return descripcion;
    }

}