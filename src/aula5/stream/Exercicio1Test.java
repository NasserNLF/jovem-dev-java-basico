package aula5.stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class Exercicio1Test {

	@Test
	void test() {
		//Preparo
		List<Integer> lista = new ArrayList<>();
		lista.add(10);
		lista.add(20);
		lista.add(30);
		
		List<Integer> listaVazia = new ArrayList<>();
		
		//Executa
		Integer resultado = Exercicio1.somaNumeros(lista);
		Integer resultadoListaVazia = Exercicio1.somaNumeros(listaVazia);
		
		//Testa
		// O assert é usado para testes - O que espero - O que quero testar
		assertEquals(60, resultado);
		assertEquals(0, resultadoListaVazia);
	}

}
