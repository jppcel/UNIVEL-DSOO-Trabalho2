package me.polles.crudSystem.client.controller;

import java.util.ArrayList;
import java.util.Collection;

import me.polles.crudSystem.Pessoa;

public class PessoaController {
	Collection<Pessoa> pessoas;

	public PessoaController(){
		this.pessoas = new ArrayList<Pessoa>();
	}
	public PessoaController(Collection<Pessoa> _pessoas){
		this.pessoas = _pessoas;
	}
	
	public Collection<Pessoa> getPessoas(){
		return pessoas;
	}
	
	public void addPessoa(Pessoa _pessoa){
		pessoas.add(_pessoa);
	}
	
	public void setPessoas(Collection<Pessoa> _pessoas){
		this.pessoas = _pessoas;
	}
}
