/**
 * Licensee: Patricio Caceres
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class DeleteEncriptacionData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = orm.EncriptacionPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.DAOFactory lDAOFactory = orm.DAOFactory.getDAOFactory();
			orm.dao.Log_RegistroDAO lormLog_RegistroDAO = lDAOFactory.getLog_RegistroDAO();
			orm.Log_Registro lormLog_Registro = lormLog_RegistroDAO.loadLog_RegistroByQuery(null, null);
			// Delete the persistent object
			lormLog_RegistroDAO.delete(lormLog_Registro);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteEncriptacionData deleteEncriptacionData = new DeleteEncriptacionData();
			try {
				deleteEncriptacionData.deleteTestData();
			}
			finally {
				orm.EncriptacionPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
