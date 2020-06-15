package br.com.senai.fatesg.primefaces.persistencia;

import org.springframework.stereotype.Repository;

import br.com.ambientinformatica.jpa.persistencia.PersistenciaJpa;
import br.com.senai.fatesg.primefaces.entidade.VisitanteEntity;

@Repository("visitanteDao")
public class VisitanteDaoJpa extends PersistenciaJpa<VisitanteEntity> implements VisitanteDao {

	private static final long serialVersionUID = 1L;
}
