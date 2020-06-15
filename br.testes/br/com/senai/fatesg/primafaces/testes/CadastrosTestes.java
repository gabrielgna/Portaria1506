package br.com.senai.fatesg.primafaces.testes;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.senai.fatesg.primefaces.entidade.Cadastrados;
import br.com.senai.fatesg.primefaces.persistencia.CadastradosDao;

public class CadastrosTestes {
    
	@Autowired
	CadastradosDao cadastradosDao;
	
	@Test
	public void pesquisar(String nome) {
		
		List<Cadastrados> cadastradoPesquisado = cadastradosDao.buscaPor(nome);
		
		for (Cadastrados cadastrados : cadastradoPesquisado) {			
			assertEquals("07711025181", cadastrados.getCpf());
		}		
	}
	

}
