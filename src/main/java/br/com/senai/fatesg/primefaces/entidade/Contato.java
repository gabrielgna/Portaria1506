package br.com.senai.fatesg.primefaces.entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Contato {

	@Id
	@GeneratedValue(generator = "contato_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "contato_seq", sequenceName = "contato_seq", allocationSize = 1, initialValue = 1)
	private Integer id;

	private String nome;
	private String telefone;
	private String email;
	private String endereco;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Integer getId() {
		return id;
	}

}
