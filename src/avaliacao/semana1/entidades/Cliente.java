package avaliacao.semana1.entidades;

import java.time.LocalDate;

public class Cliente {
	private String nomeCliente;
	private LocalDate dataNasc;

	
	public Cliente(String nomeCliente, LocalDate dataNasc) {
		super();
		this.nomeCliente = nomeCliente;
		this.dataNasc = dataNasc;
	}


	public String getNomeCliente() {
		return nomeCliente;
	}


	public LocalDate getDataNasc() {
		return dataNasc;
	}
	
	
	
	
	
	
	
	
}
