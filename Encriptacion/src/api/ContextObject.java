/**
 * Aplicacion del patron facade para responder a las peticiones de los clientes de la encriptacion
 * note que se ocupa un patron Prototype para crear el encriptador y el desencriptador, de manera que
 * estos se diferencian en la clave con la que se encripta
 */
package api;
import encriptacion.*;

/**
 * @author kron623
 * GPL V3
 */
public class ContextObject {
	//clave para cambiar al prototipo del objeto Encriptador
	private static String[] claveDecode= {"1","2","3","4","5","6","7","8","9","0"};
	//encriptador de texto murcielago
	private static Encriptador oMurcielagoEncode = Encriptador.getPrototype();
	//desencriptador de texto murcielago
	private static Encriptador oMurcielagoDecode = Encriptador.getPrototype();
	//el objeto actual
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
	 * Cambia el parametro del prototypo Encriptador para crear desencriptaciones del codigo
	 * @see getoMurcielagoEncode()
	 * @return oMurcielagoDecode decodificador Murcielago
	 */
	public static Encriptador getoMurcielagoDecode() {
		oMurcielagoDecode.setClave(claveDecode);
		return oMurcielagoDecode;
	}
	/**
	 * Crea un encriptador de Codigo murcielago
	 * @return oMurcielagoEncode Objeto encriptador
	 */
	public static Encriptador getoMurcielagoEncode(){
		return oMurcielagoEncode;
	}
}

