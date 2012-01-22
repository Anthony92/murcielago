/**
 * 
 */
package ws;

import java.util.Calendar;
import java.util.Date;
import org.orm.PersistentException;
import api.ContextObject;
/**
 * 
 * @author kron623
 * GPL V3
 */
public class Encriptacion {

	/**
	 * Entrega la encriptacion murcielago de un texto
	 * @param texto
	 * @return respuesta el texto encriptado o un mensaje de error
	 * @throws PersistentException 
	 */
	public String encripta(String texto) throws PersistentException{
		double tiempoInicial = System.currentTimeMillis();
		double tiempoFinal;
		String tiempo="";
		String respuesta= "";
		if(!texto.isEmpty()){
			respuesta = ContextObject.getoMurcielagoEncode().encripta(texto);
		}
		else{
			respuesta = "No ingresa texto";
		}
		tiempoFinal = System.currentTimeMillis();
		tiempoFinal= (tiempoFinal - tiempoInicial);
		tiempo = Double.toString(tiempoFinal);
		apiLog.ContextObject.getoLog().createData(horaActual(), texto, respuesta, tiempo);
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
