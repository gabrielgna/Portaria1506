package br.com.senai.fatesg.primefaces.entidade;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.print.attribute.standard.DateTimeAtCompleted;

@Entity
public class VisitanteEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	private String nome;
	private String RG;

	@ManyToOne
	@JoinColumn(name = "idCadastrado")
	private CadastradosEntity cadastradosEntity;

	private boolean status;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public CadastradosEntity getCadastrados() {
		return cadastradosEntity;
	}

	public void setCadastrados(CadastradosEntity cadastradosEntity) {
		this.cadastradosEntity = cadastradosEntity;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRG() {
		return RG;
	}

	public void setRG(String rG) {
		RG = rG;
	}

	public CadastradosEntity getCadastradosEntity() {
		return cadastradosEntity;
	}

	public void setCadastradosEntity(CadastradosEntity cadastradosEntity) {
		this.cadastradosEntity = cadastradosEntity;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
