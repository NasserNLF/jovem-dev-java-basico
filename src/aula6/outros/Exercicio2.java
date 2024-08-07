package aula6.outros;

public class Exercicio2 {
	public static void main(String[] args) {
		System.out.println(Calculadora1Enum.SOMA.getNomeAmigavel() + " - " + Calculadora1Enum.SOMA.getCalculo().calcula(10, 2));
		System.out.println(Calculadora1Enum.SUBTRACAO.getNomeAmigavel() + " - " + Calculadora1Enum.SUBTRACAO.getCalculo().calcula(10, 2));
		System.out.println(Calculadora1Enum.DIVISAO.getNomeAmigavel() + " - " + Calculadora1Enum.DIVISAO.getCalculo().calcula(10, 2));
		System.out.println(Calculadora1Enum.MULTIPLICACAO.getNomeAmigavel() + " - " + Calculadora1Enum.MULTIPLICACAO.getCalculo().calcula(10, 2));
	}
}
