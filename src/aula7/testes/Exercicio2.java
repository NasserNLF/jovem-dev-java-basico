package aula7.testes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import aula5.stream.Exercicio5;
import aula5.stream.exceptions.ZeroBertoException;

class Exercicio2 {
	
	//Teste Exercicio 5 - Aula 5 - Stream

	private List<String> lista = new ArrayList<>();
	
	@AfterEach
	void setup() {
		lista.clear();
	}
	
	@Test
	void testeComDoisBertoNaLista() {
		lista.add("João");
		lista.add("Maria");
		lista.add("Humberto");
		lista.add("Dagoberto");
		
		assertEquals("Berto encontrado! Humberto", Exercicio5.retornaBerto(lista));
	}
	
	
	@Test
	void testeComUmBertoNaLista() {
		//Preparação
		lista.add("João");
		lista.add("Maria");
		lista.add("Humberto");
		
		assertEquals("Berto encontrado! Humberto", Exercicio5.retornaBerto(lista));
	}
	
	@Test
	void testeSemBertoNaLista() {
		lista.add("João");
		lista.add("Maria");
		
		assertThrows(ZeroBertoException.class, () -> Exercicio5.retornaBerto(lista));
	}
	

}
