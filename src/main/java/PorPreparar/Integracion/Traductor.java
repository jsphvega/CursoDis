package PorPreparar.Integracion;

import Integracion.ConexionWatson;

/**
 * Esta clase permite gestionar la traduccion de texto por medio del servicio de
 * IBM Watson
 * 
 * @author ChuckyBueno
 * @since 11-Octubre-2016
 */
public class Traductor implements ConexionWatson {

    private String USUARIO = "a37aae1c-fcb1-4d3e-8af3-c31e40ebe93c";
    private String CONTRASENA="EoGT0QJcVqAv";

    //private static LanguageTranslator servicio;

    /**
     * Metodo constructor de la clase Traductor
     */
    public Traductor() {
	//servicio = new LanguageTranslator(USUARIO, CONTRASEÑA);
    }

    /**
     * Metodo que permite autenticar el servicio Languaje Translation
     */
    public void autenticarServicio() {
	//servicio.setUsernameAndPassword(CONTRASEÑA, USUARIO);
    }

    /**
     * Metodo que permite llamar el metodo de translate del servicio y devolver
     * un string con la traduccion de español a ingles
     */
    public String traducirTexto(String pTexto) {
	//TranslationResult translationResult = servicio.translate(pTexto, Language.SPANISH, Language.ENGLISH).execute();
	//String traduccion = translationResult.getTranslations().get(0).getTranslation();
	//return traduccion;
	return null;
    }
}