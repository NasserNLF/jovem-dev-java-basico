package aula6.outros;

public class Exercicio3 {
	public static void main(String[] args) {
		System.out.println(Calculadora2Enum.SOMA.getNomeAmigavel() + " - " + Calculadora2Enum.SOMA.getCalculo().apply(10, 2));
		System.out.println(Calculadora2Enum.SUBTRACAO.getNomeAmigavel() + " - " + Calculadora2Enum.SUBTRACAO.getCalculo().apply(10, 2));
		System.out.println(Calculadora2Enum.DIVISAO.getNomeAmigavel() + " - " + Calculadora2Enum.DIVISAO.getCalculo().apply(10, 2));
		System.out.println(Calculadora2Enum.MULTIPLICACAO.getNomeAmigavel() + " - " + Calculadora2Enum.MULTIPLICACAO.getCalculo().apply(10, 2));
	}
	
}
