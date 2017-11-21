/**
 * 
 */
package com.teste.ejb.sample.service;

import java.sql.Connection;

/**
 * @author jeds
 *Interface para Factory Connection
 */
public interface ConectDataBase {
    
	/**
	 * Metodo a ser implementado para obter a conexão com o BD
	 * @return 
	 */
	public Connection getConnection();
}
