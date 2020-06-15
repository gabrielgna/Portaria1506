package br.com.senai.fatesg.primefaces.controle;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;
import br.com.ambientinformatica.ambientjsf.util.UtilFaces;
import br.com.senai.fatesg.primefaces.entidade.VisitanteEntity;
import br.com.senai.fatesg.primefaces.persistencia.VisitanteDao;

@Named("VisitantesControl")
@RequestScoped
public class VisitantesControl {

	private VisitanteEntity visitante = new VisitanteEntity();
	@Autowired
	private VisitanteDao visitantedao;

	private List<VisitanteEntity> visitantes = new ArrayList<VisitanteEntity>();

	@PostConstruct
	public void init() {
		listar(null);
	}

	public void listar(ActionEvent evt) {
		try {
			visitantes = visitantedao.listar();
		} catch (Exception e) {
			UtilFaces.addMensagemFaces(e);
		}
	}

	public void confirmar(ActionEvent evt) {
		try {
			visitantedao.incluir(visitante);
			listar(evt);
			visitante = new VisitanteEntity();
		} catch (Exception e) {
			UtilFaces.addMensagemFaces(e);
		}
	}
	
	public void alterarStatus() {
		visitante.setStatus(false);
	}

	public VisitanteEntity getVisitante() {
		return visitante;
	}

	public void setVisitante(VisitanteEntity visitante) {
		this.visitante = visitante;
	}

	public List<VisitanteEntity> getVisitantes() {
		return visitantes;
	}

	public void setVisitantes(List<VisitanteEntity> visitantes) {
		this.visitantes = visitantes;
	}

}
