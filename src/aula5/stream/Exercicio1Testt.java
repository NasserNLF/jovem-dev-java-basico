package aula5.stream;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Exercicio1Testt {

	private List<Pessoa> lista = new ArrayList<>();
	
	@BeforeEach
	void setup() {
		lista.clear();
		lista.add(new Pessoa("Lucas", LocalDate.parse("1960-07-07")));
		lista.add(new Pessoa("Arthur", LocalDate.parse("1959-07-07")));
		lista.add(new Pessoa("Jonathan", LocalDate.parse("1958-07-07")));
	}
	
//	@Test
//	void deveRetornarListaComOsNomeQueComecamComVogalOuNasceramAnoBissexto() {
//		//O método está estático pois fiz o exercicio no método MAIN
//		List<String> listaStrings = Desafio.retornaListaString(lista);
//		
//		assert
//		
//	}
	
	
	@Test
	void deveRetornarListaVaziaSeNaoComecarComVogalOuNascerAnoBissexto () {
		//Preparação
		lista.clear();
		
		//O método está estático pois fiz o exercicio no método MAIN
		List<String> listaStrings = Desafio.retornaListaString(lista);
		
		assertEquals(0, listaStrings.size());
	}
	
	

}
