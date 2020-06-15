package br.com.senai.fatesg.primefaces.entidade;

import javax.persistence.*;
import java.util.List;

import org.hibernate.validator.constraints.NotBlank;


@Entity
public class CadastradosEntity {

    @Id
    @GeneratedValue(generator = "cadastrados_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "cadastrados_seq", sequenceName = "cadastrados_seq", allocationSize = 1, initialValue = 1)
    private Long idCadastrado;

    @NotBlank
    @Column(nullable = false)
    private String cpf;

    private String email;
    private String nome;
    private String celular;
    private String tipo;
    private String senha;

    //getters setters

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Long getIdCadastrado() {
        return idCadastrado;
    }

    public void setIdCadastrado(Long idCadastrado) {
        this.idCadastrado = idCadastrado;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTipo() {return tipo;}

    public void setTipo(String tipo) {this.tipo = tipo;}
}