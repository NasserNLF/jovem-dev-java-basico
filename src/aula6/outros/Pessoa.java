package aula6.outros;

import java.time.LocalDate;

public class Pessoa {
	private String nome;
	private String telefone;
	private LocalDate dataNasc;

	public Pessoa(String nome, String telefone, LocalDate dataNasc) {
		this.nome = nome;
		this.telefone = telefone;
		this.dataNasc = dataNasc;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();

		builder.append("Pessoa: ");
		builder.append(nome);
		builder.append(", telefone: ");
		builder.append(telefone);
		builder.append(", dataNasc: ");
		builder.append(dataNasc);

		return builder.toString();
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

}
