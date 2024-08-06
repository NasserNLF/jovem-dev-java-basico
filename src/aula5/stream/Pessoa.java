package aula5.stream;

import java.time.LocalDate;

public class Pessoa {
	private String nome;
	private String telefone;
	private LocalDate dataNasc;
	
	//Construtor Exercicio 4
	public Pessoa(String nome, String telefone, LocalDate dataNasc) {
		this.nome = nome;
		this.telefone = telefone;
		this.dataNasc = dataNasc;
	}
	
	//Construtor Desafio
	public Pessoa(String nome, LocalDate dataNasc) {
		this.nome = nome;
		this.dataNasc = dataNasc;
	}

	public String getNome() {
		return nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public LocalDate getDataNasc() {
		return dataNasc;
	}

	@Override
	public String toString() {
		return "Pessoa: " + nome + "\nData de Nascimento: " + dataNasc + "\n\n"; 
	}
	
	
	
}
