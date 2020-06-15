package br.com.senai.fatesg.primefaces.persistencia;

import org.springframework.stereotype.Repository;

import br.com.ambientinformatica.jpa.persistencia.PersistenciaJpa;
import br.com.senai.fatesg.primefaces.entidade.Movimentacao_visitante;

@Repository("MovimentacaoVisitanteDao")
public class MovimentacaoVisitanteDaoJpa extends PersistenciaJpa<Movimentacao_visitante>
		implements MovimentacaoVisitantesDao {

	private static final long serialVersionUID = 1L;
}
