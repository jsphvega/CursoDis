package Negocios;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import PorPreparar.Negocios.Consulta;

/**
 * Clase que se encarga de crear un documento TXT de acuerdo a un texto dado
 * 
 * @author ChuckyBueno
 * @since 11-Octubre-2016
 */
public class TXT extends Documento {

    private File archivo;

    /**
     * Metodo que crea un archivo txt
     */
    public void crearDocumento() {
	archivo = new File(retornarRuta() + ".txt");
    }

    /**
     * Metodo que toma un arraylist y transcribe todos los elementos en un
     * archivo
     */
    public void escribirEnDocumento(ArrayList<Consulta> pTexto) throws IOException {
	// atributos que mantienen y crean el documento
	String temporal;
	String[] temp;
	BufferedWriter output = null;

	try {
	    output = new BufferedWriter(new FileWriter(archivo));

	    // Ciclo para añadir el texto en la variable para ejecutar el
	    // documento
	    for (int i = 0; i < pTexto.size(); i++) {
		// porque o sino no reconoce el salto de linea
		temp = pTexto.get(i).imprimirCorrectas().split("\n");

		for (int j = 0; j < temp.length; j++) {
		    temporal = temp[j];
		    output.write(temporal);
		    output.newLine();
		}

		output.newLine();
	    }
	} catch (IOException e) {
	    e.printStackTrace();
	} finally {
	    if (output != null) {
		output.close();
	    }
	}
    }
}