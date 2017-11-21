package com.teste.maven.modules.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "programacaoBean")
@SessionScoped
public class ProgramacaoBean {
	
	/**
	 * Construtor Padrão
	 */
	public ProgramacaoBean(){
		
	}
	
	/**
	 * Retorna a lista de aulas 
	 * @return
	 */
	public String listaDeAulas(){
		return "";
	}

}
