package br.com.senai.fatesg.primefaces.entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Empresa {
	@Id
	@GeneratedValue(generator = "empresa_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "empresa_seq", sequenceName = "empresa_seq", allocationSize = 1, initialValue = 1)
	private Integer id;
	private String nomefantasia;
	private String telefone;
	private String endereco;
	private String razaosocial;
	private String CNPJ;

	public String getNomefantasia() {
		return nomefantasia;
	}

	public void setNomefantasia(String nomefantasia) {
		this.nomefantasia = nomefantasia;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getRazaosocial() {
		return razaosocial;
	}

	public void setRazaosocial(String razaosocial) {
		this.razaosocial = razaosocial;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public Integer getId() {
		return id;
	}

}


