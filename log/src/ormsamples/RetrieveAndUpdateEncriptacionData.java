/**
 * Licensee: Patricio Caceres
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateEncriptacionData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = orm.EncriptacionPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.DAOFactory lDAOFactory = orm.DAOFactory.getDAOFactory();
			orm.dao.Log_RegistroDAO lormLog_RegistroDAO = lDAOFactory.getLog_RegistroDAO();
			orm.Log_Registro lormLog_Registro = lormLog_RegistroDAO.loadLog_RegistroByQuery(null, null);
			// Update the properties of the persistent object
			lormLog_RegistroDAO.save(lormLog_Registro);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Log_Registro by Log_RegistroCriteria");
		orm.Log_RegistroCriteria lormLog_RegistroCriteria = new orm.Log_RegistroCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormLog_RegistroCriteria.reg_id_registro.eq();
		System.out.println(lormLog_RegistroCriteria.uniqueLog_Registro());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateEncriptacionData retrieveAndUpdateEncriptacionData = new RetrieveAndUpdateEncriptacionData();
			try {
				retrieveAndUpdateEncriptacionData.retrieveAndUpdateTestData();
				//retrieveAndUpdateEncriptacionData.retrieveByCriteria();
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
