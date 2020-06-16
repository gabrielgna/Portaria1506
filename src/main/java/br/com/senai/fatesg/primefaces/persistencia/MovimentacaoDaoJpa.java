package br.com.senai.fatesg.primefaces.persistencia;

import br.com.ambientinformatica.jpa.exception.PersistenciaException;
import br.com.ambientinformatica.jpa.persistencia.PersistenciaJpa;
import br.com.senai.fatesg.primefaces.entidade.CadastradosEntity;
import br.com.senai.fatesg.primefaces.entidade.Movimentacao;
import org.springframework.stereotype.Repository;

import javax.persistence.PersistenceException;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

@Repository("MovimentacaoDao")
public class MovimentacaoDaoJpa extends PersistenciaJpa<Movimentacao> implements MovimentacaoDao {
    private static final long serialVersionUID = 1L;

    @Override
    public String ConfirmarEstado(Long IdCadastrado) {
        List<Movimentacao> MovCadastrados = new ArrayList<Movimentacao>();
        MovCadastrados = em.createQuery("SELECT * FROM Movimentacao  where cadastrados_id =" + IdCadastrado + "").getResultList();
        int ultimo = MovCadastrados.size();
        if (ultimo <= 0) return "saida";
        else {
            String EstadoUltimo = MovCadastrados.get(ultimo).getTipo();
            return EstadoUltimo;
        }
    }

}
