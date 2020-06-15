package br.com.senai.fatesg.primefaces.persistencia;

import br.com.ambientinformatica.jpa.persistencia.PersistenciaJpa;
import br.com.senai.fatesg.primefaces.entidade.Movimentacao;
import org.springframework.stereotype.Repository;

@Repository("MovimentacaoDao")
public class MovimentacaoDaoJpa extends PersistenciaJpa<Movimentacao> implements MovimentacaoDao{

    private static final long serialVersionUID = 1L;
}
