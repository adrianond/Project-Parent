package com.teste.ejb.sample.impl;

import javax.ejb.Stateless;
import com.teste.ejb.sample.service.MeuPrimeiroBeanLocal;

/**
 * Session Bean implementation class MeuPrimeiroBean
 */
@Stateless
public class MeuPrimeiroBean implements MeuPrimeiroBeanLocal {

    /**
     * Default constructor. 
     */
    public MeuPrimeiroBean() {
    	
    }

	@Override
	public void helloWorld() {
		 System.out.println("Hello World EJB Module Maven + JSF 2");
	}

}
