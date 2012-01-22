/**
 * 
 */
package ws;

import java.util.Calendar;
import java.util.Date;

import org.orm.PersistentException;

import api.ContextObject;

/**
 * @author kron623
 * GPL V3  
 */
public class Desencriptacion {
	/**
	 * Entrega la desencripta segun el metodo murcielago de una clave
	 * @param texto
	 * @return respuesta el texto encriptado o un mensaje de error
	 * @throws PersistentException 
	 */
	public String desencripta(String clave) throws PersistentException{
		double tiempoInicial = System.currentTimeMillis();
		double tiempoFinal;
		String tiempo="";
		String respuesta="";
		if(!clave.isEmpty()){
			respuesta = ContextObject.getoMurcielagoDecode().encripta(clave);
		}
		else{
			respuesta= "Ingrese una clave";
		}
		tiempoFinal = System.currentTimeMillis();
		tiempoFinal= (tiempoFinal - tiempoInicial);
		tiempo = Double.toString(tiempoFinal);
		apiLog.ContextObject.getoLog().createData(horaActual(), clave, respuesta, tiempo);
		
		return respuesta;
	}
	/**
	 * Calcula la hora actual del sistema, y la formatea al estilo definido a la base de datos 
	 * HH:MM:SS 
	 * @return HORA la hora actual del sistema
	 */
	private String horaActual(){
		
        Calendar calendarioAhora = Calendar.getInstance();
        Date dateAhora = calendarioAhora.getTime();
        String hora = ""+ dateAhora.getHours() + "";
        String minutos = "" + dateAhora.getMinutes() + "";
        String segundos = "" + dateAhora.getSeconds() + "";
        String HORA = hora +""+ minutos +""+ segundos;
		return HORA;
	}


}
