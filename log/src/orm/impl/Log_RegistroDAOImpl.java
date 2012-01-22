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
package orm.impl;

import org.orm.*;
import org.hibernate.Query;
import java.util.List;
import orm.*;

public class Log_RegistroDAOImpl implements orm.dao.Log_RegistroDAO {
	public Log_Registro loadLog_RegistroByORMID(int reg_id_registro) throws PersistentException {
		try {
			PersistentSession session = orm.EncriptacionPersistentManager.instance().getSession();
			return loadLog_RegistroByORMID(session, reg_id_registro);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Log_Registro getLog_RegistroByORMID(int reg_id_registro) throws PersistentException {
		try {
			PersistentSession session = orm.EncriptacionPersistentManager.instance().getSession();
			return getLog_RegistroByORMID(session, reg_id_registro);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Log_Registro loadLog_RegistroByORMID(int reg_id_registro, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.EncriptacionPersistentManager.instance().getSession();
			return loadLog_RegistroByORMID(session, reg_id_registro, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Log_Registro getLog_RegistroByORMID(int reg_id_registro, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.EncriptacionPersistentManager.instance().getSession();
			return getLog_RegistroByORMID(session, reg_id_registro, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Log_Registro loadLog_RegistroByORMID(PersistentSession session, int reg_id_registro) throws PersistentException {
		try {
			return (Log_Registro) session.load(orm.Log_Registro.class, new Integer(reg_id_registro));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Log_Registro getLog_RegistroByORMID(PersistentSession session, int reg_id_registro) throws PersistentException {
		try {
			return (Log_Registro) session.get(orm.Log_Registro.class, new Integer(reg_id_registro));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Log_Registro loadLog_RegistroByORMID(PersistentSession session, int reg_id_registro, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Log_Registro) session.load(orm.Log_Registro.class, new Integer(reg_id_registro), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Log_Registro getLog_RegistroByORMID(PersistentSession session, int reg_id_registro, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Log_Registro) session.get(orm.Log_Registro.class, new Integer(reg_id_registro), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryLog_Registro(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.EncriptacionPersistentManager.instance().getSession();
			return queryLog_Registro(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryLog_Registro(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.EncriptacionPersistentManager.instance().getSession();
			return queryLog_Registro(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Log_Registro[] listLog_RegistroByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.EncriptacionPersistentManager.instance().getSession();
			return listLog_RegistroByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Log_Registro[] listLog_RegistroByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.EncriptacionPersistentManager.instance().getSession();
			return listLog_RegistroByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryLog_Registro(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Log_Registro as Log_Registro");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryLog_Registro(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Log_Registro as Log_Registro");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Log_Registro[] listLog_RegistroByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryLog_Registro(session, condition, orderBy);
			return (Log_Registro[]) list.toArray(new Log_Registro[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Log_Registro[] listLog_RegistroByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryLog_Registro(session, condition, orderBy, lockMode);
			return (Log_Registro[]) list.toArray(new Log_Registro[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Log_Registro loadLog_RegistroByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.EncriptacionPersistentManager.instance().getSession();
			return loadLog_RegistroByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Log_Registro loadLog_RegistroByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.EncriptacionPersistentManager.instance().getSession();
			return loadLog_RegistroByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Log_Registro loadLog_RegistroByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Log_Registro[] log_Registros = listLog_RegistroByQuery(session, condition, orderBy);
		if (log_Registros != null && log_Registros.length > 0)
			return log_Registros[0];
		else
			return null;
	}
	
	public Log_Registro loadLog_RegistroByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Log_Registro[] log_Registros = listLog_RegistroByQuery(session, condition, orderBy, lockMode);
		if (log_Registros != null && log_Registros.length > 0)
			return log_Registros[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateLog_RegistroByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.EncriptacionPersistentManager.instance().getSession();
			return iterateLog_RegistroByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateLog_RegistroByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.EncriptacionPersistentManager.instance().getSession();
			return iterateLog_RegistroByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateLog_RegistroByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Log_Registro as Log_Registro");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateLog_RegistroByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Log_Registro as Log_Registro");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Log_Registro createLog_Registro() {
		return new orm.Log_Registro();
	}
	
	public boolean save(orm.Log_Registro log_Registro) throws PersistentException {
		try {
			orm.EncriptacionPersistentManager.instance().saveObject(log_Registro);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete(orm.Log_Registro log_Registro) throws PersistentException {
		try {
			orm.EncriptacionPersistentManager.instance().deleteObject(log_Registro);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean refresh(orm.Log_Registro log_Registro) throws PersistentException {
		try {
			orm.EncriptacionPersistentManager.instance().getSession().refresh(log_Registro);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict(orm.Log_Registro log_Registro) throws PersistentException {
		try {
			orm.EncriptacionPersistentManager.instance().getSession().evict(log_Registro);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Log_Registro loadLog_RegistroByCriteria(Log_RegistroCriteria log_RegistroCriteria) {
		Log_Registro[] log_Registros = listLog_RegistroByCriteria(log_RegistroCriteria);
		if(log_Registros == null || log_Registros.length == 0) {
			return null;
		}
		return log_Registros[0];
	}
	
	public Log_Registro[] listLog_RegistroByCriteria(Log_RegistroCriteria log_RegistroCriteria) {
		return log_RegistroCriteria.listLog_Registro();
	}
}
