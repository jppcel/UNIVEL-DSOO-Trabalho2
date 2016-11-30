package me.polles.crudSystem;

import java.io.Serializable;

public class Pessoa extends PessoaPai implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String cpf;
	private String rg;
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
}
