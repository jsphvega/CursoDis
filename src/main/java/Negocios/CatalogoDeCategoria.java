package Negocios;

import java.io.FileNotFoundException;
import java.util.*;

import Negocios.Consulta;

public class CatalogoDeCategoria {

    private String nombre;
    private ArrayList<Consulta> consultas;

    public CatalogoDeCategoria(String pNombre) {
	this.nombre=pNombre;
	consultas = new ArrayList<Consulta>();
    }

    public String getNombre() {
	return nombre;
    }

    public void crearConsulta(String pPregunta) throws FileNotFoundException, InterruptedException {
	 Consulta consulta1= new Consulta(pPregunta);
	 consultas.add(consulta1);
    }

}