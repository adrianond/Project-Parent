package com.teste.maven.modules.bean;

//import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

//import com.teste.ejb.sample.service.MeuPrimeiroBeanLocal;

@SessionScoped
@ManagedBean(name = "boasVindasBean")
public class BoasVindasBean {
	
//@EJB
//private MeuPrimeiroBeanLocal meuBean;	


 
public BoasVindasBean(){
	  super();
  }

  
  public String hello(){
	  //meuBean.helloWorld();  
	  return "";
  }
}
