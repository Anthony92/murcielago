/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Patricio Caceres
 * License Type: Evaluation
 */
package orm;

import orm.impl.*;
import orm.dao.*;

public class DAOFactoryImpl extends DAOFactory {
	private Log_RegistroDAO _log_RegistroDAO = new Log_RegistroDAOImpl();
	public Log_RegistroDAO getLog_RegistroDAO() {
		return _log_RegistroDAO;
	}
	
}

