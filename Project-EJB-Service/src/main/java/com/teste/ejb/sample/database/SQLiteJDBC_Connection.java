package com.teste.ejb.sample.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class SQLiteJDBC_Connection {

	/** Instância de conexão com BD**/
private static Connection connect = null;
   
	public  void conexao(){
		
		try {
			Class.forName("org.sqlite.JDBC");
			connect = DriverManager.getConnection("jdbc:sqlite:C:/desenv/bodyBuilder/bodyBuilder.dl");
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		System.out.println("Opened database successfully");
	}
}
