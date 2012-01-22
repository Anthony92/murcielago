/**
 * Test por java comandos de el encriptador Murcielago
 */
package test;
import encriptacion.*;
import api.*;
/**
 * @author kron623
 *
 */
public class TestEncode {

	/**
	 * Funcion principal
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("El codigo codificado es   :   '" + ContextObject.getoMurcielagoEncode().encripta("viva la tropa") +"'");
		System.out.println("El codigo decodificado es :   '" + ContextObject.getoMurcielagoDecode().encripta("L8 t30p8 6s 78 421b58") +"'");
	}

}
