package br.com.senai.fatesg.primefaces.entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class AreaDeLazer {
	
	@Id
	@GeneratedValue(generator = "areadelazer_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "areadelazer_seq", sequenceName = "areadelazer_seq", allocationSize = 1, initialValue = 1)
	private int id;

	private String nome;
	private String local;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public int getId() {
		return id;
	}
	
	
	
}
