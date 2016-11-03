package Controlador;

import java.io.FileNotFoundException;
import java.util.*;

import DTO.DTOArchivoCategoria;
import DTO.DTOArchivoConversacion;
import DTO.DTOEntrenamientoTutor;
import DTO.DTORespuestaSatisfactoria;
import Integracion.Conversacion;
import Integracion.Traductor;
import Negocios.Consulta;
import Negocios.EntradaVoz;
import Negocios.FabricaDocumento;
import Negocios.Informacion;

public class Controlador {

    public Controlador() {
    }

    public String imprimir() {
	return "prueba";
    }

    public void traducirRespuestas(Consulta pConsulta) {
	Traductor sTraductor = new Traductor();
	sTraductor.autenticarServicio();

	System.out.println(sTraductor.traducirTexto(pConsulta.getPregunta()));
    }

    public void agregarRespuestasPreguntas(DTOEntrenamientoTutor pEntrenamiento) {
	Conversacion cc;
	cc = Conversacion.getInstance();
	if (cc.agregarInformacion(pEntrenamiento.getPregunta(), pEntrenamiento.getRespuesta(),
		pEntrenamiento.getPregunta()))
	    System.out.println("Si ingresa");
    }

    public String grabarAudio() {
	try {
	    EntradaVoz sEntrada = new EntradaVoz();
	    return sEntrada.procesarPregunta();
	} catch (Exception e) {
	    return "No se reconoce";
	}
    }

    public String obtenerRespuestas(Consulta pConsulta) {
	Conversacion sConversacion;
	sConversacion = Conversacion.getInstance();
	ArrayList<Informacion> listaConversacion = sConversacion.consultarInformacion(pConsulta.getPregunta());

	if (listaConversacion.size() == 0)
	    return "No hay";
	else {
	    String sTexto = "";
	    for (int i = 0; i < listaConversacion.size(); i++)
		sTexto += listaConversacion.get(i).getDescripcion() + "\n";
	    return sTexto;
	}

    }

    public void crearDocumentoConversacion(DTOArchivoConversacion pArchivoConversacion) {
	ArrayList<Consulta> listaConsultas = new ArrayList<>();

	Consulta sConsulta1 = new Consulta("Cuanto costo la almohada");
	sConsulta1.agregarRespuesta("Costo 5000 colones");
	sConsulta1.agregarRespuesta("O tal vez costo mas");

	Consulta sConsulta2 = new Consulta("Cuantos pedos se tiro anoche");
	sConsulta2.agregarRespuesta("Todos, me desmaye y no pude contar");

	listaConsultas.add(sConsulta1);
	listaConsultas.add(sConsulta2);

	FabricaDocumento sFabrica = new FabricaDocumento();
	sFabrica.crearDocumento(pArchivoConversacion.getTipo(), listaConsultas);
    }

    public void guardarIncorrectas(ArrayList<Consulta> pIncorrectas) {
	// TODO implement here
    }

    public void crearDocumentoCategoria(DTOArchivoCategoria pArchivoCategoria) {
	// TODO implement here
    }

    public Boolean verificarRespuesta(DTORespuestaSatisfactoria pRespuesta) {
	// TODO implement here
	return false;
    }

    public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException, InterruptedException {
	Controlador sControlador = new Controlador();

	/*Consulta pConsulta = new Consulta("Mariposa");
	sControlador.traducirRespuestas(pConsulta);*/

	/*DTOArchivoConversacion sDTOConversacion = new	DTOArchivoConversacion(); 
	sDTOConversacion.setTipo("PDF");
	sDTOConversacion.setTipo("TXT");
	sControlador.crearDocumentoConversacion(sDTOConversacion);*/

	/*DTOEntrenamientoTutor sDTOTutor = new DTOEntrenamientoTutor();
	sDTOTutor.setPregunta("#Diseño"); 
	sDTOTutor.setRespuesta("Esto es una prueba de Diseño"); 
	sControlador.agregarRespuestasPreguntas(sDTOTutor);*/
	
	Consulta pConsulta = new Consulta(sControlador.grabarAudio());
	System.out.println(sControlador.obtenerRespuestas(pConsulta));

	
    }
}