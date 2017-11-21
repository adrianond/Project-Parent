package com.teste.maven.modules.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "cadastroColaboradorBean")
@SessionScoped
public class CadastroColaboradorBean {
	
	/**
	 * Construtor Padrão
	 */
	public CadastroColaboradorBean(){
		
	}
	
	/**
	 * Inicia inclusão de aluno novo
	 */
	public String incluir(){
		
		return "";
	}

}
