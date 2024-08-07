package aula6.outros;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ExemploJunitTest {
	
	@BeforeEach
	void setup() {
		 exemplo = new ExemploJunit(50);
	}
	
	private ExemploJunit exemplo = new ExemploJunit(50);
	


	@Test
	@DisplayName("Caso seja 0, deve retornar ZERO; Exceção caso contrário")
	void deveRetornarStringZeroQuandoNumeroIgualAZero() {
		//Preparação
		int i = 0;
		
		exemplo = new ExemploJunit(50);
		
		//Executa
		String s = exemplo.verificaNumero(i);
		
		//Testa
		assertEquals("ZERO", s);
	}
	
	@Test
	void deveDispararExcecaoSeNumeroDiferenteZero() {
		//Preparação
		int i = 1;
	
		assertThrows(IllegalArgumentException.class, () -> exemplo.verificaNumero(i));
	}

}
