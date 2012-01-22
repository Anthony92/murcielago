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
package orm.dao;

import org.orm.*;
import orm.*;

public interface Log_RegistroDAO {
	public Log_Registro loadLog_RegistroByORMID(int reg_id_registro) throws PersistentException;
	public Log_Registro getLog_RegistroByORMID(int reg_id_registro) throws PersistentException;
	public Log_Registro loadLog_RegistroByORMID(int reg_id_registro, org.hibernate.LockMode lockMode) throws PersistentException;
	public Log_Registro getLog_RegistroByORMID(int reg_id_registro, org.hibernate.LockMode lockMode) throws PersistentException;
	public Log_Registro loadLog_RegistroByORMID(PersistentSession session, int reg_id_registro) throws PersistentException;
	public Log_Registro getLog_RegistroByORMID(PersistentSession session, int reg_id_registro) throws PersistentException;
	public Log_Registro loadLog_RegistroByORMID(PersistentSession session, int reg_id_registro, org.hibernate.LockMode lockMode) throws PersistentException;
	public Log_Registro getLog_RegistroByORMID(PersistentSession session, int reg_id_registro, org.hibernate.LockMode lockMode) throws PersistentException;
	public Log_Registro[] listLog_RegistroByQuery(String condition, String orderBy) throws PersistentException;
	public Log_Registro[] listLog_RegistroByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryLog_Registro(String condition, String orderBy) throws PersistentException;
	public java.util.List queryLog_Registro(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Log_Registro[] listLog_RegistroByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Log_Registro[] listLog_RegistroByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryLog_Registro(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List queryLog_Registro(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Log_Registro loadLog_RegistroByQuery(String condition, String orderBy) throws PersistentException;
	public Log_Registro loadLog_RegistroByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Log_Registro loadLog_RegistroByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Log_Registro loadLog_RegistroByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Log_Registro createLog_Registro();
	public boolean save(orm.Log_Registro log_Registro) throws PersistentException;
	public boolean delete(orm.Log_Registro log_Registro) throws PersistentException;
	public boolean refresh(orm.Log_Registro log_Registro) throws PersistentException;
	public boolean evict(orm.Log_Registro log_Registro) throws PersistentException;
	public Log_Registro loadLog_RegistroByCriteria(Log_RegistroCriteria log_RegistroCriteria);
	public Log_Registro[] listLog_RegistroByCriteria(Log_RegistroCriteria log_RegistroCriteria);
}
