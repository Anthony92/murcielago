/**
 * Utilizacion del patron de software Prototype para codificar y decodificar textos segun la regla 
 * del murcielago
 */
package encriptacion;

/**
 * @author kron623
 * GPL V3
 *
 */
public class Encriptador {
	private static Encriptador oEncriptadorClon;
	private  String[] clave;
	private String[] claveDecode = {"1","2","3","4","5","6","7","8","9","0"};
	private String[] claveEncode = {"m","u","r","c","i","e","l","a","g","o"};
	/**
	 * construtor privado vacio
	 */
	private Encriptador(){
		
	}
	/**
	 * si no existe el prototipo crea uno 
	 * @return prototype Objeto prototipo
	 */
	public static Encriptador getPrototype() {
		String[] clave = {"m","u","r","c","i","e","l","a","g","o"};
		if(oEncriptadorClon == null) {
		        oEncriptadorClon = new Encriptador();
		        oEncriptadorClon.setClave(clave);
		}
		        return oEncriptadorClon;
	}
	/**
	 * Retorna el Prototypo
	 * @return oEncriptadorClon
	 */
	public static Encriptador getoEncriptadorClon() {
		return oEncriptadorClon;
	}
	/**
	 *  Ingresa el encriptador clon
	 * @param oEncriptadorClon
	 */
	
	public static void setoEncriptadorClon(Encriptador oEncriptadorClon) {
		Encriptador.oEncriptadorClon = oEncriptadorClon;
	}
	/**
	 * Retorna la clave 
	 * @return clave
	 */
	public String[] getClave() {
		return clave;
	}
	/**
	 * ingresa la clave 
	 * @param clave
	 */
	public void setClave(String[] clave) {
		this.clave = clave;
	}
	/**
	 * Camibia el contenido del texto ingresado a la notacion inversa ocupando el metodo del murcielago
	 * depende el objeto actual creado, por que si es el  prototipo por defecto codifica el texto
	 * si no aplica la tecnica de encriptacion.
	 * @param texto
	 * @return
	 */
	public String encripta(String texto){
		//paso todo a minusculas
		texto = texto.toLowerCase();
		//decodifica el texto
		if(clave[0].equals("1")){
			System.out.println("Decodificador");
			for(int i = 0; i < claveDecode.length ; i++){
				texto = texto.replace(claveDecode[i], claveEncode[i]);
			}
		}
		//codifica el texto si en el objeto el prototipo es cambiado a un decodificador 
		else{
			for(int i = 0; i < claveDecode.length ; i++){
				texto = texto.replace(claveEncode[i], claveDecode[i] );
			}
			
		}
		return texto;
	}
}
