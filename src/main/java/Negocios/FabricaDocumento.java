package Negocios;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

import PorPreparar.Negocios.Consulta;

/**
 * Clase que se encarga de crear un documento cumpliendo con los principios de
 * diseño, ya que se encarga de crear el tipo de documento por medio de un
 * string
 * 
 * @author ChuckyBueno
 * @since 11-Octubre-2016
 */
public class FabricaDocumento {

    private static String PAQUETE = "Negocios.";
    private Class documento;
    private String nombreArchivo = "PreguntasYRespuestas";

    /**
     * Metodo que se encarga de crear el ripo de documento requerido por el
     * usuario
     * 
     * @param pTipoDoc
     *            El tipo de documento requerido
     * @param pConsultas
     *            Las consultas registradas
     * @throws ClassNotFoundException
     */
    public void crearDocumento(String pTipoDoc, ArrayList<Consulta> pConsultas) throws ClassNotFoundException {
	// Nombre del documento
	String nombreClase = PAQUETE + pTipoDoc;
	documento = Class.forName(nombreClase);

	try {
	    // Se crea la instancia
	    Object docInstance = documento.newInstance();

	    // Se declaran los metodos que tendrá
	    Method setNombreArchivoMetodo = documento.getMethod("setNombreArchivo", String.class);
	    Method crearDocumentoMetodo = documento.getMethod("crearDocumento", null);
	    Method escribirEnDocumentoMetodo = documento.getMethod("escribirEnDocumento", ArrayList.class);

	    // Se invocan a los metodos
	    setNombreArchivoMetodo.invoke(docInstance, nombreArchivo);
	    crearDocumentoMetodo.invoke(docInstance, null);
	    escribirEnDocumentoMetodo.invoke(docInstance, pConsultas);

	} catch (NoSuchMethodException | IllegalArgumentException | IllegalAccessException | InstantiationException
		| InvocationTargetException e) {
	    e.printStackTrace();
	}
    }

}