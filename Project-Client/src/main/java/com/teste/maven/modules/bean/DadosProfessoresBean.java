package com.teste.maven.modules.bean;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "dadosProfessoresBean")
@SessionScoped
public class DadosProfessoresBean {
    
	/**
	 * Construtor Padr�o
	 */
	public DadosProfessoresBean(){
		
	}
	
	/**
	 * Informa��es dos professores
	 * @return
	 */
	public String cadastroProfessores(){
		
		return "";
	}
}
