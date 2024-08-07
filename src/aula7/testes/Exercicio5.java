package aula7.testes;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

class Exercicio5 {

	@Test
	void testaValorRaio() {
		BigDecimal circunferencia = BigDecimal.valueOf(10);
		BigDecimal div = BigDecimal.valueOf(2*Math.PI);
		

		BigDecimal resultado = BigDecimal.valueOf(1.5915);
		
		assertEquals(resultado, aula6.outros.Exercicio5.calculaRaio(circunferencia, div));
		
	}
}
