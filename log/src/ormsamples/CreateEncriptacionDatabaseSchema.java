/**
 * Licensee: Patricio Caceres
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class CreateEncriptacionDatabaseSchema {
	public static void main(String[] args) {
		try {
			ORMDatabaseInitiator.createSchema(orm.EncriptacionPersistentManager.instance());
			orm.EncriptacionPersistentManager.instance().disposePersistentManager();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
