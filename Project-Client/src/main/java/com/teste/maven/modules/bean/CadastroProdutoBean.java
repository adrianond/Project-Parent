package com.teste.maven.modules.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "cadastroProdutoBean")
@SessionScoped
public class CadastroProdutoBean {
	
	/**
	 * Construtor Padr�o
	 */
	public CadastroProdutoBean(){
		
	}
	
	/**
	 * Inicia inclus�o de aluno novo
	 */
	public String incluir(){
		
		return "";
	}

}
