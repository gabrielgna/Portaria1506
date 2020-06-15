package br.com.senai.fatesg.primefaces.controle;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.event.ActionEvent;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.ambientinformatica.ambientjsf.util.UtilFaces;

import br.com.senai.fatesg.primefaces.entidade.Imovel;
import br.com.senai.fatesg.primefaces.persistencia.ImovelDao;

@Named("ImovelControl")
public class ImovelControl {

	private Imovel imovel = new Imovel();

	@Autowired
	private ImovelDao imoveisDao;

	private List<Imovel> imoveis = new ArrayList<Imovel>();

	@PostConstruct
	public void init() {
		listar(null);
	}

	public void listar(ActionEvent evt) {
		try {
			imoveis = imoveisDao.listar();
		} catch (Exception e) {
			UtilFaces.addMensagemFaces(e);
		}
	}

	public void confirmar(ActionEvent evt) {
		try {
			imoveisDao.alterar(imovel);
			listar(evt);
			imovel = new Imovel();
		} catch (Exception e) {
			UtilFaces.addMensagemFaces(e);
		}
	}


	public Imovel getImovel() {
		return imovel;
	}

	public void setImovel(Imovel imovel) {
		this.imovel = imovel;
	}

	public List<Imovel> getImoveis() {
		return imoveis;
	}

	

}
