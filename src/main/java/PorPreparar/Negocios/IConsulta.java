package PorPreparar.Negocios;

import java.util.ArrayList;

public interface IConsulta {
   public abstract String getPregunta();
   public abstract ArrayList<String> getRespuestas() ;
   public abstract void setPregunta(String pPregunta);
   public abstract String imprimirCorrectas();
   public abstract void agregarRespuesta(String pRespuesta);
}