package br.com.senai.fatesg.primefaces.persistencia;

import java.util.List;

import javax.persistence.PersistenceException;

import br.com.ambientinformatica.jpa.persistencia.Persistencia;
import br.com.senai.fatesg.primefaces.entidade.CadastradosEntity;

public interface CadastradosDao extends Persistencia<CadastradosEntity> {

	public List<CadastradosEntity> buscaPor(String nome)throws PersistenceException;
	
}
