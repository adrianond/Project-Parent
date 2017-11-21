package com.teste.maven.modules.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "historicoAlunoBean")
@SessionScoped
public class HistoricoAlunoBean {
	
	/**
	 * Construtor Padrão
	 */
	public HistoricoAlunoBean(){
		
	}

	/**
	 * Histórico de frequência do launo
	 * @return
	 */
	public String historico(){
		
		return "";
	}
}
