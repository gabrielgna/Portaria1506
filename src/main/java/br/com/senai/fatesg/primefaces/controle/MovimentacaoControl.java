package br.com.senai.fatesg.primefaces.controle;

import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import javax.inject.Named;

import br.com.senai.fatesg.primefaces.entidade.CadastradosEntity;
import br.com.senai.fatesg.primefaces.entidade.Movimentacao;
import br.com.senai.fatesg.primefaces.persistencia.MovimentacaoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

@Named("MovimentacaoControl")
@Scope("conversation")
public class MovimentacaoControl {
    private Movimentacao movimentacao = new Movimentacao();

    @Autowired
    private MovimentacaoDao movimentacaoDao;


    public void Confirmar(CadastradosEntity cadastradosEntity){
        String estado = movimentacaoDao.ConfirmarEstado(cadastradosEntity.getIdCadastrado());
        if (estado.equalsIgnoreCase("saida")){
            movimentacao.setTipo("entrada");
        }else {
            movimentacao.setTipo("saida");
        }
        movimentacao.setCadastradosEntity(cadastradosEntity);
        movimentacao.setHorario(new Date());
        movimentacaoDao.incluir(movimentacao);
        addMessage("Sucesso");
        movimentacao = new Movimentacao();
    }


    public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

}
