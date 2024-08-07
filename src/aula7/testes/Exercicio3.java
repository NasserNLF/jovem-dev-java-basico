package aula7.testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class Exercicio3 {

	private List<Integer> nums = new ArrayList<>();
	OperacaoListas ol = new OperacaoListas();
	
	@AfterEach
	void setup() {
		nums.clear();
	}
	
	@Test
	void testeSomaNumeros() {
		nums.add(10);
		nums.add(20);
		
		int soma = ol.somaNumeros(nums);
		
		assertEquals(30, soma);
	}
	
	@Test
	void testeRetornaMediaMaiorCinquenta() {
		nums.add(50);
		nums.add(60);
		nums.add(70);
		nums.add(80);
		
		double media = ol.retornaMediaMaioresCinquenta(nums);
		
		assertEquals(70, media);
	}
	
	@Test
	void testeConta25() {
		nums.add(25);
		nums.add(25);
		nums.add(30);
		
		int qtd = ol.conta25(nums);
		
		assertEquals(2, qtd);
	}

}
