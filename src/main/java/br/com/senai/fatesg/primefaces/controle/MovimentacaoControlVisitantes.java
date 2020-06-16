package br.com.senai.fatesg.primefaces.controle;

import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import br.com.senai.fatesg.primefaces.persistencia.VisitanteDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;


import br.com.senai.fatesg.primefaces.entidade.Movimentacao_visitante;
import br.com.senai.fatesg.primefaces.entidade.VisitanteEntity;
import br.com.senai.fatesg.primefaces.persistencia.MovimentacaoVisitantesDao;

@Named("MovimentacaoControlVisitantes")
@Scope("conversation")
public class MovimentacaoControlVisitantes {
	private Movimentacao_visitante movimentacaoVisitante = new Movimentacao_visitante();

	@Autowired
	private MovimentacaoVisitantesDao movimentacaoVisitanteDao;

	@Autowired
	private VisitanteDao visitanteDao;

	public void Confirmar(VisitanteEntity visitantes) {
		movimentacaoVisitante.setCadastrados(visitantes.getCadastrados());
		movimentacaoVisitante.setVisitantes(visitantes);
		movimentacaoVisitante.setHorario(new Date());
		visitantes.setStatus(false);
		visitanteDao.alterar(visitantes);
		movimentacaoVisitanteDao.incluir(movimentacaoVisitante);
		addMessage("Sucesso");
		movimentacaoVisitante = new Movimentacao_visitante();

	}


	public void addMessage(String summary) {
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, null);
		FacesContext.getCurrentInstance().addMessage(null, message);
	}
}
