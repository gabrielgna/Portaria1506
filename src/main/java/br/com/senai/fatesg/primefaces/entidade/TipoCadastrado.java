package br.com.senai.fatesg.primefaces.entidade;


import javax.persistence.*;
import java.util.List;

@Entity
public class TipoCadastrado {

	@Id
	@GeneratedValue(generator = "tipocadastrado_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "tipocadastrado_seq", sequenceName = "tipocadastrado_seq", allocationSize = 1, initialValue = 1)
	private int id;
	
	private String tipo;

	public TipoCadastrado() {}

	public TipoCadastrado(int id , String tipo) {
		this.id=id;
		this.tipo=tipo;
	}

	//getter e setters
	public int getId() {return id;}

	public void setId(int id) {this.id = id;}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
