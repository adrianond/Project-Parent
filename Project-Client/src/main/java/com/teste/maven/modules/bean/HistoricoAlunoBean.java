package com.teste.maven.modules.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "historicoAlunoBean")
@SessionScoped
public class HistoricoAlunoBean {
	
	/**
	 * Construtor Padr�o
	 */
	public HistoricoAlunoBean(){
		
	}

	/**
	 * Hist�rico de frequ�ncia do launo
	 * @return
	 */
	public String historico(){
		
		return "";
	}
}
