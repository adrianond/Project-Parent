package com.teste.maven.modules.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import com.teste.ejb.sample.persistence.model.AlunoEjb;
import com.teste.maven.modules.constantes.Constantes_Utils;
import com.teste.maven.modules.model.Aluno;
import com.teste.maven.modules.util.MessagePropertiesAcess;

@ManagedBean(name = "pesquisarTreinoBean")
@RequestScoped
public class PesquisarTreinoBean {
    
	/** Variavel de instância aluno **/
	private Aluno aluno = null;
	/** Variavel de instância alunoEjb **/
	private AlunoEjb alunoEjb = null;
     
	
	/**
	 * Cosntrutor Padrão
	 */
	public PesquisarTreinoBean(){
		
		aluno = new Aluno();
	}
	
	/**
	 * Série de treinos
	 * @return
	 */
	public String dadosSerieTreino(){
		validarDados();
		dadosConsultaTreino(alunoEjb);
		
		
		return "";
	}
    
	/**
	 * 
	 * @param alunoEjb
	 */
	private void dadosConsultaTreino(AlunoEjb alunoEjb) {
		//Lista com a serie de treinos do aluno
		List<String> seriesTreino = new ArrayList<String>();
		
		alunoEjb = new AlunoEjb();
		alunoEjb.setNome(aluno.getNome());
		alunoEjb.setMatricula(aluno.getMatricula());
		alunoEjb.setCPF(aluno.getCPF());
		//Passa os dados para consulta do treino do aluno
		//seriesTreino = alunoEjb.ConsultarTreino(alunoEjb);
	}

	/**
	 * Valida se os dados do formulário foram preenchidos
	 */
	public void validarDados() {
        if(aluno.getNome().equals("") || aluno.getCPF().equals("") || aluno.getMatricula() == Constantes_Utils.ZERO){
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage( null, new FacesMessage(FacesMessage.SEVERITY_INFO, MessagePropertiesAcess.propertiesLoader().getProperty("rotulo_consulta_treino").toString(), 
					MessagePropertiesAcess.propertiesLoader().getProperty("rotulo_consulta_treino").toString()));
		}
	}

	/**
	 *  
	 * @return
	 */
	public Aluno getAluno() {
		return aluno;
	}
    
	/**
	 *  
	 * @param aluno
	 */
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	
	
	
}
