/**
 * Registros del sistema ocupando hibernate y patron de diseño facade 
 */
package apiLog;
/**
 * 
 * @author kron623
 * GPL V3
 */
public class ContextObject {
	private static Log oLog = new Log();
	private static ContextObject oContextObject = null;
	/**
	 * constructor privado del patron
	 */
	private ContextObject(){
		
	}
	/**
	 * retorna una instancia ContextObject si no existe crea una nueva
	 * @return oContextObject
	 */
	public static ContextObject getContextObject(){
		if(oContextObject==null){
			oContextObject = new ContextObject();
		}	
		return oContextObject;
	}
	/**
	 * retorna un log del sistema
	 * @return
	 */
	public static Log getoLog() {
		return oLog;
	}
	/**
	 * ingresa un nuevo log
	 * @param oLog
	 */
	public static void setoLog(Log oLog) {
		ContextObject.oLog = oLog;
	}

}
