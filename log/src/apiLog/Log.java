/**
 * 
 */
package apiLog;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

/**
 * Manejador de logs para funciones 
 * @author kron623
 * GPL V3
 */
public class Log {
	
	public String createData(String hora, String parametro, String resultado, String tiempo) throws PersistentException {
		String respuesta = "";
		PersistentTransaction t = orm.EncriptacionPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.DAOFactory lDAOFactory = orm.DAOFactory.getDAOFactory();
			orm.dao.Log_RegistroDAO lormLog_RegistroDAO = lDAOFactory.getLog_RegistroDAO();
			orm.Log_Registro lormLog_Registro = lormLog_RegistroDAO.createLog_Registro();
			lormLog_Registro.setReg_hora(hora);
			lormLog_Registro.setReg_parametro(parametro);
			lormLog_Registro.setReg_resultado(resultado);
			lormLog_Registro.setReg_tiempo(tiempo);
			// Initialize the properties of the persistent object here
			lormLog_RegistroDAO.save(lormLog_Registro);
			t.commit();
			respuesta= "realizado";
		}
		catch (Exception e) {
			t.rollback();
			respuesta = "no realizado";
		}
		return respuesta;
	}
}
