package aula6.outros;

public enum Calculadora1Enum {
	SOMA("Soma", (n1, n2) -> n1 + n2), SUBTRACAO("Subtração", (n1, n2) -> n1 - n2),
	DIVISAO("Divisão", (n1, n2) -> n1 / n2), MULTIPLICACAO("Multiplicação", (n1, n2) -> n1 * n2);

	private String nomeAmigavel;
	private CalculoInterface calculo;

	private Calculadora1Enum(String nomeAmigavel, CalculoInterface calculo) {
		this.nomeAmigavel = nomeAmigavel;
		this.calculo = calculo;
	}

	public String getNomeAmigavel() {
		return nomeAmigavel;
	}
	
	

	
	

}
