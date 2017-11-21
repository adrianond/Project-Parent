package com.teste.maven.modules.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "parceriasBean")
@SessionScoped
public class ParceriasBean {
	
	/**
	 * ConstrutorPadrão
	 */
    public ParceriasBean(){
    	
    }
    
    /**
     * Retorna lista de parceiros 
     * @return
     */
    public String consulta(){
    	
    	return "";
    }
}
