package Negocios;

import PorPreparar.Negocios.EntradaVoz;

/**
 * Clase que se encarga de manejar todas la informacion acerca de la pregunta y
 * la obtencion de los datos
 * 
 * @author ChuckyBueno
 * @since 11-Octubre-2016
 */
public class Pregunta {

    private String pregunta;

    /**
     * Metodo que se encarga de obtener la pregunta del atributo
     * 
     * @return La pregunta registrada
     */
    public String getPregunta() {
	return pregunta;
    }

    /**
     * Metodo que registra la pregunta por medio de voz
     */
    public void setPregunta() {
	EntradaVoz sVoz = new EntradaVoz();
	pregunta = sVoz.convertirAudio();
    }

    /**
     * Metodo que registra la pregunta por medio de texto
     */
    public void setPregunta(String pPregunta) {
	pregunta = pPregunta;
    }

}