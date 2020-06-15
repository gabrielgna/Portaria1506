package br.com.senai.fatesg.primefaces.controle;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.event.ActionEvent;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import br.com.ambientinformatica.ambientjsf.util.UtilFaces;
import br.com.senai.fatesg.primefaces.entidade.Empresa;
import br.com.senai.fatesg.primefaces.entidade.TipoCadastrado;
import br.com.senai.fatesg.primefaces.persistencia.EmpresaDao;
import br.com.senai.fatesg.primefaces.persistencia.TipoCadastradosDao;

@Named("TipoCadastradoControl")
@Scope("conversation")
public class TipoCadastradoControl {

	private TipoCadastrado tipocadastro = new TipoCadastrado();

	@Autowired
	private TipoCadastradosDao tipoCadastradosDao;

	private List<TipoCadastrado> listTipoCadastrados = new ArrayList<TipoCadastrado>();
	

	@PostConstruct
	public void init() {
		listar(null);
	}

	public void listar(ActionEvent evt) {
		try {
			listTipoCadastrados = tipoCadastradosDao.listar();
		} catch (Exception e) {
			UtilFaces.addMensagemFaces(e);
		}
	}

	public void incluir(ActionEvent evt) {
		try {
			tipoCadastradosDao.incluir(tipocadastro);
			listar(evt);
			tipocadastro = new TipoCadastrado();
		} catch (Exception e) {
			UtilFaces.addMensagemFaces(e);
		}
	}

	public TipoCadastrado getTipocadastro() {
		return tipocadastro;
	}

	public void setTipocadastro(TipoCadastrado tipocadastro) {
		this.tipocadastro = tipocadastro;
	}

	public List<TipoCadastrado> getListTipoCadastrados() {
		return listTipoCadastrados;
	}

	public void setListTipoCadastrados(List<TipoCadastrado> listTipoCadastrados) {
		this.listTipoCadastrados = listTipoCadastrados;
	}
	


	
}



