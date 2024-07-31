package aula3.tratamentoerros;

import aula3.tratamentoerros.exceptions.ZeroException;

public class Exercicio2 {
	public static void main(String[] args) {
		new Exercicio2();
	}

	public Exercicio2() {
		try {
			System.out.println(divisao(2.3, 1));
		} catch (ZeroException e) {
			System.out.println("O segundo número não pode ser 0");
		}

	}

	public static double divisao(double num1, double num2) throws ZeroException {
		if (num2 == 0) {
			throw new ZeroException();
		}
		return num1 / num2;
	}
}
