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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class Log_RegistroCriteria extends AbstractORMCriteria {
	public final IntegerExpression reg_id_registro;
	public final StringExpression reg_hora;
	public final StringExpression reg_parametro;
	public final StringExpression reg_resultado;
	public final StringExpression reg_tiempo;
	
	public Log_RegistroCriteria(Criteria criteria) {
		super(criteria);
		reg_id_registro = new IntegerExpression("reg_id_registro", this);
		reg_hora = new StringExpression("reg_hora", this);
		reg_parametro = new StringExpression("reg_parametro", this);
		reg_resultado = new StringExpression("reg_resultado", this);
		reg_tiempo = new StringExpression("reg_tiempo", this);
	}
	
	public Log_RegistroCriteria(PersistentSession session) {
		this(session.createCriteria(Log_Registro.class));
	}
	
	public Log_RegistroCriteria() throws PersistentException {
		this(orm.EncriptacionPersistentManager.instance().getSession());
	}
	
	public Log_Registro uniqueLog_Registro() {
		return (Log_Registro) super.uniqueResult();
	}
	
	public Log_Registro[] listLog_Registro() {
		java.util.List list = super.list();
		return (Log_Registro[]) list.toArray(new Log_Registro[list.size()]);
	}
}

