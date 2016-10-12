package Integracion;

import com.ibm.watson.developer_cloud.language_translator.v2.LanguageTranslator;
import com.ibm.watson.developer_cloud.language_translator.v2.model.Language;
import com.ibm.watson.developer_cloud.language_translator.v2.model.TranslationResult;

import Integracion.ConexionWatson;

/**
 * Esta clase permite gestionar la traduccion de texto por medio del servicio de
 * IBM Watson
 * 
 * @author ChuckyBueno
 * @since 11-Octubre-2016
 */
public class Traductor implements ConexionWatson {

    private String USUARIO = "44ffdf8f-076e-4fa2-8b12-36a614e62afe";
    private String CONTRASENA = "dyX62nw3F3WM";

    private static LanguageTranslator servicio;

    /**
     * Metodo constructor de la clase Traductor
     */
    public Traductor() {
	servicio = new LanguageTranslator();
    }

    /**
     * Metodo que permite autenticar el servicio Languaje Translation
     */
    public void autenticarServicio() {
	servicio.setUsernameAndPassword(USUARIO, CONTRASENA);
    }

    /**
     * Metodo que permite llamar el metodo de translate del servicio y devolver
     * un string con la traduccion de español a ingles
     */
    public String traducirTexto(String pTexto) {
	try {
	    TranslationResult translationResult = servicio.translate(pTexto, Language.SPANISH, Language.ENGLISH)
		    .execute();
	    String traduccion = translationResult.getTranslations().get(0).getTranslation();
	    return traduccion;
	} catch (Exception e) {
	    return "";
	}
    }
}