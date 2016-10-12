package Negocios;

import java.util.ArrayList;

/**
 * Interfaz que maneja los procesos relacionados a la consulta
 * 
 * @author ChuckyBueno
 * @since 11-Octubre-2016
 */
public interface IConsulta {
    public abstract String getPregunta();

    public abstract ArrayList<String> getRespuestas();

    public abstract void setPregunta(String pPregunta);

    public abstract String imprimirCorrectas();

    public abstract void agregarRespuesta(String pRespuesta);
}