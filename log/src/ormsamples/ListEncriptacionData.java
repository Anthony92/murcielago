/**
 * Licensee: Patricio Caceres
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class ListEncriptacionData {
	private static final int ROW_COUNT = 100;
	
public void listTestData() throws PersistentException {
		orm.DAOFactory lDAOFactory = orm.DAOFactory.getDAOFactory();
		System.out.println("Listing Log_Registro...");
		orm.Log_Registro[] ormLog_Registros = lDAOFactory.getLog_RegistroDAO().listLog_RegistroByQuery(null, null);
		int length = Math.min(ormLog_Registros.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormLog_Registros[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException  {
		System.out.println("Listing Log_Registro by Criteria...");
		orm.Log_RegistroCriteria lormLog_RegistroCriteria = new orm.Log_RegistroCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormLog_RegistroCriteria.reg_id_registro.eq();
		lormLog_RegistroCriteria.setMaxResults(ROW_COUNT);
		orm.Log_Registro[] ormLog_Registros = lormLog_RegistroCriteria.listLog_Registro();
		int length =ormLog_Registros== null ? 0 : Math.min(ormLog_Registros.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormLog_Registros[i]);
		}
		System.out.println(length + " Log_Registro record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListEncriptacionData listEncriptacionData = new ListEncriptacionData();
			try {
				listEncriptacionData.listTestData();
				//listEncriptacionData.listByCriteria();
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
