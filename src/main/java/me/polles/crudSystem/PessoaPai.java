package me.polles.crudSystem;

import java.util.Date;

public class PessoaPai {
	private String nome;
	private Date nascimento;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	} 
}
