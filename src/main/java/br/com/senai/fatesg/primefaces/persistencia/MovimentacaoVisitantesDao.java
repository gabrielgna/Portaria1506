package br.com.senai.fatesg.primefaces.persistencia;

import br.com.ambientinformatica.jpa.persistencia.Persistencia;
import br.com.senai.fatesg.primefaces.entidade.Movimentacao_visitante;

public interface MovimentacaoVisitantesDao extends Persistencia<Movimentacao_visitante>{
    public String ConfirmarEstadoVisi(Long IdCadastrado);
}
