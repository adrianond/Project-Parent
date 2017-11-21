package com.teste.ejb.sample.impl;


import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import com.teste.ejb.sample.database.dao.Dao;
import com.teste.ejb.sample.persistence.model.AlunoEjb;
import com.teste.ejb.sample.service.BodyBuilderBDLocal;

/**
 * Session Bean implementation class SelectDadosBD
 */
@Stateless
public class BodyBuilderBD extends Dao implements BodyBuilderBDLocal {
    
    /**
     * Default constructor. 
     */
    public BodyBuilderBD() {
       
    }

	  
	
     /**
	 * Retorna lista com a sÃ©rie de treino do aluno
	 */
	
	public List<?> consultarTreino(AlunoEjb alunoEjb) {
		/** Variavel connect **//*
		Connection connect = null;
		*//** Variavel de conexão **//*
		ObterConexaoDB conexao = new ObterConexaoDB();
		
		
		connect = conexao.getConnection();

		if (!alunoEjb.getNome().equals(CosntantesUtils.STRING_VAZIA)) {
			// select através do nome + data - Senão informar nome completo e houver mais de um nome igual, abre uma grid para selecionar o nome do aluno
		} else if (!alunoEjb.getCPF().equals(CosntantesUtils.STRING_VAZIA)) {
			// select através do cpf
		} else {
			// select através do numero de matricula + data
		}
		try {
			connect.close();
		} catch (SQLException e) {
			System.out.println(e);
			e.printStackTrace();
		}*/
		
		return null;
	}


    /**
     * AlunoEjb alunoEjb
     */
	@Override
	public boolean inserirNovoAluno(AlunoEjb alunoEjb) {
		//obtendo o EntityManager
		EntityManager em = getEntityManager();
		try {
			// begin transaction 
		    em.getTransaction().begin();
			//faz a persistencia
			em.persist(alunoEjb);
			// flush em - save to DB
	        em.flush();
	        // commit transaction at all
	        em.getTransaction().commit();
	        //fecha banco
	        em.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
