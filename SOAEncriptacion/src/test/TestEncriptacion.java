/**
 * Test de encriptacion y des-encriptacion ocupando el metodo del murcielago
 */
package test;
import org.orm.PersistentException;

import ws.Desencriptacion;
import ws.Encriptacion;
/**
 * @author kron623
 *
 */
public class TestEncriptacion {
	
	public static void main(String args[]) throws PersistentException{
		System.out.println("Encriptando : "+ new Encriptacion().encripta("pato"));
		System.out.println("Encriptando : "+ new Encriptacion().encripta(""));
		System.out.println("desencriptando : "+ new Desencriptacion().desencripta(""));
		System.out.println("desencriptando : "+ new Desencriptacion().desencripta("p8t0"));
	}

}
