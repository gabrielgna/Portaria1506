package br.com.senai.fatesg.primefaces.entidade;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import br.com.ambientinformatica.corporativo.entidade.Pessoa;

@Entity
public class RegArealazer {

	@Id
	@GeneratedValue(generator = "regarealazer_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "regarealazer_seq", sequenceName = "regarealazer_seq", allocationSize = 1, initialValue = 1)
	private int id;
	private Date data;	
	
	@OneToOne
	@JoinColumn(name="areadelazer_id")
	AreaDeLazer areadelazer;
	
	@OneToOne
	@JoinColumn(name="pessoa_id")
	Pessoa pessoa;

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public AreaDeLazer getAreadelazer() {
		return areadelazer;
	}

	public void setAreadelazer(AreaDeLazer areadelazer) {
		this.areadelazer = areadelazer;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public int getId() {
		return id;
	}
	
	
	
}
