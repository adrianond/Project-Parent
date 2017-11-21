package com.teste.maven.modules.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "pesquisarAlunoBean")
@SessionScoped
public class PesquisarAlunoBean {
	
	/**
	 * Construtor Padrão
	 */
	public PesquisarAlunoBean(){
		
	}
	
	/**
	 * Pesquisar aluno
	 * @return
	 */
	public String pesquisar(){
		return "";
	}

}
