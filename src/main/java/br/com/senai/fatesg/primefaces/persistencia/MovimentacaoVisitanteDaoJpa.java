package br.com.senai.fatesg.primefaces.persistencia;

import org.springframework.stereotype.Repository;

import br.com.ambientinformatica.jpa.persistencia.PersistenciaJpa;
import br.com.senai.fatesg.primefaces.entidade.Movimentacao_visitante;

import java.util.List;

@Repository("MovimentacaoVisitanteDao")
public class MovimentacaoVisitanteDaoJpa extends PersistenciaJpa<Movimentacao_visitante>
		implements MovimentacaoVisitantesDao {

	private static final long serialVersionUID = 1L;

	@Override
	public String ConfirmarEstadoVisi(Long idVisitante) {
		List<Movimentacao_visitante> MovVis;
		MovVis = em.createQuery("SELECT p FROM Movimentacao_visitante p where idVisitante =" + idVisitante + "").getResultList();
		int ultimo = (MovVis.size() - 1);
		if (ultimo < 0)
			return "saida";
		else {
			String EstadoUltimo = MovVis.get(ultimo).getTipo();
			return EstadoUltimo;
		}
	}
}
