package br.com.senai.fatesg.primefaces.controle;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;

import br.com.senai.fatesg.primefaces.entidade.CadastradosEntity;
import org.springframework.context.annotation.Scope;

@Named("RelatorioControl")
@Scope("conversation")
public class RelatorioControl {

	private CadastradosEntity cadastradoSelecioando;
	
	private List<CadastradosEntity> cadastrados = new ArrayList<CadastradosEntity>();
	
	
	public List<CadastradosEntity> getCadastrados() {
		return cadastrados;
	}
}
