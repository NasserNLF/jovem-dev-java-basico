package aula7.testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import aula6.outros.Calculadora2Enum;

class Exercicio4 {

	@Test
	void testeSoma() {

		int soma = Calculadora2Enum.SOMA.getCalculo().apply(10, 2);

		assertEquals(12, soma);
	}
	
	@Test
	void testeSubtracao() {

		int sub = Calculadora2Enum.SUBTRACAO.getCalculo().apply(10, 2);

		assertEquals(8, sub);
	}
	
	@Test
	void testeDiv() {

		int div = Calculadora2Enum.DIVISAO.getCalculo().apply(10, 2);

		assertEquals(5, div);
	}
	
	@Test
	void testeMult() {

		int mult = Calculadora2Enum.MULTIPLICACAO.getCalculo().apply(10, 2);

		assertEquals(20, mult);
	}
	
	

}
