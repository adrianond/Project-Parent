package com.teste.maven.modules.bean;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "dadosProfessoresBean")
@SessionScoped
public class DadosProfessoresBean {
    
	/**
	 * Construtor Padrão
	 */
	public DadosProfessoresBean(){
		
	}
	
	/**
	 * Informações dos professores
	 * @return
	 */
	public String cadastroProfessores(){
		
		return "";
	}
}
