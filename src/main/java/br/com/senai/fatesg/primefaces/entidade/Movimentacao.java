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

@Entity
public class Movimentacao {

	@Id
	@GeneratedValue(generator = "movimentacao_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "movimentacao_seq", sequenceName = "movimentacao_seq", allocationSize = 1, initialValue = 1)
	private int id;
	
	
	@Temporal(TemporalType.TIME)
	private Date horario;
	private String tipo;
	
	@ManyToOne
	@JoinColumn(name="cadastrados_id")
	private CadastradosEntity cadastradosEntity;
	
	//getters e setters
	
	public Date getHorario() {
		return horario;
	}
	public CadastradosEntity getCadastradosEntity() {
		return cadastradosEntity;
	}
	public void setCadastradosEntity(CadastradosEntity cadastradosEntity) {
		this.cadastradosEntity = cadastradosEntity;
	}
	public void setHorario(Date horario) {
		this.horario = horario;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getId() {
		return id;
	}
		
}
