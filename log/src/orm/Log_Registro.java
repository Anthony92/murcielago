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

/**
 * registro de acciones por el sistema
 */
public class Log_Registro {
	public Log_Registro() {
	}
	
	private int reg_id_registro;
	
	private String reg_hora;
	
	private String reg_parametro;
	
	private String reg_resultado;
	
	private String reg_tiempo;
	
	/**
	 * clave primaria del registro
	 */
	private void setReg_id_registro(int value) {
		this.reg_id_registro = value;
	}
	
	/**
	 * clave primaria del registro
	 */
	public int getReg_id_registro() {
		return reg_id_registro;
	}
	
	public int getORMID() {
		return getReg_id_registro();
	}
	
	/**
	 * hora que el registro se ejecuto
	 */
	public void setReg_hora(String value) {
		this.reg_hora = value;
	}
	
	/**
	 * hora que el registro se ejecuto
	 */
	public String getReg_hora() {
		return reg_hora;
	}
	
	/**
	 * parámetro pasado a la función
	 */
	public void setReg_parametro(String value) {
		this.reg_parametro = value;
	}
	
	/**
	 * parámetro pasado a la función
	 */
	public String getReg_parametro() {
		return reg_parametro;
	}
	
	/**
	 * valor retornado de la funcion
	 */
	public void setReg_resultado(String value) {
		this.reg_resultado = value;
	}
	
	/**
	 * valor retornado de la funcion
	 */
	public String getReg_resultado() {
		return reg_resultado;
	}
	
	/**
	 * tiempo que se demoro en ejecutar el metodo
	 */
	public void setReg_tiempo(String value) {
		this.reg_tiempo = value;
	}
	
	/**
	 * tiempo que se demoro en ejecutar el metodo
	 */
	public String getReg_tiempo() {
		return reg_tiempo;
	}
	
	public String toString() {
		return String.valueOf(getReg_id_registro());
	}
	
}
