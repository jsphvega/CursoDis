package PorPreparar.Integracion;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import Integracion.Conversacion;
import Negocios.FabricaDocumento;
import Negocios.Informacion;
import PorPreparar.Negocios.Consulta;
import PorPreparar.Negocios.EntradaVoz;

public class ss {

    public void prueba1() {
	Conversacion cc;
	cc = Conversacion.getInstance();
	cc.agregarInformacion("TRU", "TRU", "TRU");

	ArrayList<Informacion> uu = cc.consultarInformacion("TRU");
	for (int i = 0; i < uu.size(); i++)
	    System.out.println(uu.get(i).getId());
    }

    public void prueba2() throws ClassNotFoundException, FileNotFoundException, InterruptedException {
	ArrayList<Consulta> listaConsultas = new ArrayList<>();
	Consulta consulta1 = new Consulta("Cuanto costo la almohada");
	consulta1.agregarRespuesta("Costo 5000 colones");
	consulta1.agregarRespuesta("O tal vez costo mas");

	Consulta consulta2 = new Consulta("Cuantos pedos se tiro anoche");
	consulta2.agregarRespuesta("todos, Me desmaye y no pude contar");

	listaConsultas.add(consulta1);
	listaConsultas.add(consulta2);

	FabricaDocumento prueba = new FabricaDocumento();
	prueba.crearDocumento("PDF", listaConsultas);
    }

    public void prueba3() {
	Traductor s = new Traductor();
	s.autenticarServicio();
	System.out.println(s.traducirTexto("mariposa"));
    }

    public void prueba4() throws FileNotFoundException, InterruptedException{
	VozATexto prueba = new VozATexto();
	prueba.autenticarServicio();
	prueba.buscarAudio();
	System.out.println(prueba.procesarAudio());
    }
    
    public void prueba5() throws FileNotFoundException, InterruptedException{
	EntradaVoz ss = new EntradaVoz();
	ss.procesarPregunta();
    }
    
    public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException, InterruptedException {
	ss dd = new ss();
	dd.prueba3();
    }
}
