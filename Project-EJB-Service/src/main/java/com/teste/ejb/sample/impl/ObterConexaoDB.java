package com.teste.ejb.sample.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import com.teste.ejb.sample.service.ConectDataBase;

public class ObterConexaoDB implements ConectDataBase{

	/** Instância de conexão com BD**/
private static Connection connect = null;

	@Override
	public Connection getConnection() {
		
		try {
			Class.forName("org.sqlite.JDBC");
			connect = DriverManager.getConnection("jdbc:sqlite:C:/desenv/bodyBuilderBD/bodyBuilder.dl");
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		System.out.println("Opened database successfully");
		return connect;
	}
}
