/**
 * Licensee: Patricio Caceres
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class CreateEncriptacionData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = orm.EncriptacionPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.DAOFactory lDAOFactory = orm.DAOFactory.getDAOFactory();
			orm.dao.Log_RegistroDAO lormLog_RegistroDAO = lDAOFactory.getLog_RegistroDAO();
			orm.Log_Registro lormLog_Registro = lormLog_RegistroDAO.createLog_Registro();
			// Initialize the properties of the persistent object here
			lormLog_RegistroDAO.save(lormLog_Registro);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateEncriptacionData createEncriptacionData = new CreateEncriptacionData();
			try {
				createEncriptacionData.createTestData();
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
