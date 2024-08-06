package aula6.anotacoes;

import java.util.function.Supplier;

public enum FormaPagamentoEnum {
	// Criação
	CARTAO_DEBITO(1, "Cartão de débito", () -> 0.1), CARTAO_CREDITO(2, "Cartão de crédito", () -> 0.1),
	DINHEIRO(3, "Dinheiro", () -> {
	// Calculo complexo
	return 0.2;
	}), 
	PIX(4, "PIX", () -> 0.5);

	// Atributos
	private int numero;
	private String descricao;
	private Supplier<Double> desconto;

	// Construtor
	private FormaPagamentoEnum(int numero, String descricao, Supplier<Double> desconto) {
		this.numero = numero;
		this.descricao = descricao;
		this.desconto = desconto;
	}
	
	

	// Getters
	public int getNumero() {
		return numero;
	}

	public String getDescricao() {
		return descricao;
	}

	@Override
	public String toString() {
		return String.format("%s - %s", numero, descricao);
	}

	public Supplier<Double> getDesconto() {
		return desconto;
	}

}
