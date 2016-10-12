package DTO;

/**
 * DTO que recibe los parametros de conversacion
 * 
 * @author ChuckyBueno
 * @since 11-Octubre-2016
 **/
public class DTOArchivoConversacion {

    private String tipoArchivo;

    public String getTipo() {
	return tipoArchivo;
    }

    public void setTipo(String pTipo) {
	this.tipoArchivo = pTipo;
    }

}