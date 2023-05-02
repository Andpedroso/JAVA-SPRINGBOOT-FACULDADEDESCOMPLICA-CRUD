package com.andpedroso.spring.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_instrutor")
public class Instrutor {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int rg;
	private String nome;
	private String nascimento;
	private int titulacao;
	public Instrutor() {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRg() {
		return rg;
	}
	public void setRg(int rg) {
		this.rg = rg;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNascimento() {
		return nascimento;
	}
	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
	public int getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(int titulacao) {
		this.titulacao = titulacao;
	}
}
