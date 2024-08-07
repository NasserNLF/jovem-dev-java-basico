package aula6.outros;

import java.util.function.BiFunction;

public enum Calculadora2Enum {
	SOMA("Soma", (n1, n2) -> n1 + n2), SUBTRACAO("Subtração", (n1, n2) -> n1 - n2),
	DIVISAO("Divisão", (n1, n2) -> n1 / n2), MULTIPLICACAO("Multiplicação",  (n1, n2) -> n1 * n2);
	
	private String nomeAmigavel;
	private BiFunction<Integer, Integer, Integer> calculo;
	
	private Calculadora2Enum(String nomeAmigavel, BiFunction<Integer, Integer, Integer> calculo) {
		this.nomeAmigavel = nomeAmigavel;
		this.calculo = calculo;
	}

	public String getNomeAmigavel() {
		return nomeAmigavel;
	}

	public BiFunction<Integer, Integer, Integer> getCalculo() {
		return calculo;
	}
	
	
	
	
}
