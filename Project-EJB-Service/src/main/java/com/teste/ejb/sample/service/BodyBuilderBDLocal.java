package com.teste.ejb.sample.service;

import java.util.List;
import javax.ejb.Local;
import com.teste.ejb.sample.persistence.model.AlunoEjb;

@Local
public interface BodyBuilderBDLocal {
	
	public List<?> consultarTreino(AlunoEjb alunoEjb);

    public boolean inserirNovoAluno(AlunoEjb alunoEjb);  
}
