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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class Log_RegistroDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression reg_id_registro;
	public final StringExpression reg_hora;
	public final StringExpression reg_parametro;
	public final StringExpression reg_resultado;
	public final StringExpression reg_tiempo;
	
	public Log_RegistroDetachedCriteria() {
		super(orm.Log_Registro.class, orm.Log_RegistroCriteria.class);
		reg_id_registro = new IntegerExpression("reg_id_registro", this.getDetachedCriteria());
		reg_hora = new StringExpression("reg_hora", this.getDetachedCriteria());
		reg_parametro = new StringExpression("reg_parametro", this.getDetachedCriteria());
		reg_resultado = new StringExpression("reg_resultado", this.getDetachedCriteria());
		reg_tiempo = new StringExpression("reg_tiempo", this.getDetachedCriteria());
	}
	
	public Log_RegistroDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.Log_RegistroCriteria.class);
		reg_id_registro = new IntegerExpression("reg_id_registro", this.getDetachedCriteria());
		reg_hora = new StringExpression("reg_hora", this.getDetachedCriteria());
		reg_parametro = new StringExpression("reg_parametro", this.getDetachedCriteria());
		reg_resultado = new StringExpression("reg_resultado", this.getDetachedCriteria());
		reg_tiempo = new StringExpression("reg_tiempo", this.getDetachedCriteria());
	}
	
	public Log_Registro uniqueLog_Registro(PersistentSession session) {
		return (Log_Registro) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Log_Registro[] listLog_Registro(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Log_Registro[]) list.toArray(new Log_Registro[list.size()]);
	}
}

