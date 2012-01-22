/**
 * 
 */
package test;
import java.util.concurrent.ConcurrentHashMap;

import org.orm.PersistentException;
/**
 * Test de log
 */
import apiLog.*;
/**
 * @author kron623
 *
 */
public class TestLog {

	/**
	 * @param args
	 * @throws PersistentException 
	 */
	public static void main(String[] args) throws PersistentException {
		System.out.print("El resultado fue "+ apiLog.ContextObject.getoLog().createData("220302", "Otro parametro", "el resultado", "2323") +"");
	}

}
