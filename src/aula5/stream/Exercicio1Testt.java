package aula5.stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class Exercicio1Testt {

	private List<Pessoa> lista = new ArrayList<>();
	
	@AfterEach
	void setup() {
		lista.clear();
		
	}
	
	@Test
	void deveRetornarListaComOsNomeQueComecamComVogalOuNasceramAnoBissexto() {
		lista.add(new Pessoa("Ana", LocalDate.parse("2024-07-07"))); //Vogal e Ano bissexto
		lista.add(new Pessoa("Elias", LocalDate.parse("2023-07-07"))); //Apenas Vogal
		lista.add(new Pessoa("Felipe", LocalDate.parse("2024-07-07"))); //Apenas Ano Bissexto
		lista.add(new Pessoa("Nasser", LocalDate.parse("2023-07-07"))); //Nenhum
		lista.add(new Pessoa("Marcela", LocalDate.parse("1500-07-07"))); //Nenhum
		lista.add(new Pessoa("Marcelo", LocalDate.parse("2004-07-07"))); //Nenhum
		
		
		//O método está estático pois fiz o exercicio no método MAIN
		List<String> listaStrings = Desafio.retornaListaString(lista);
		
		assertEquals("[Marcelo, Felipe, Elias, Ana]", listaStrings.toString());
		
	}
	
	
	@Test
	void deveRetornarListaVaziaSeNaoComecarComVogalOuNascerAnoBissexto () {
		
		//O método está estático pois fiz o exercicio no método MAIN
		List<String> listaStrings = Desafio.retornaListaString(lista);
		
		assertEquals(0, listaStrings.size());
	}
	
	@Test
	void deveRetornarVazioSeNaoTiverCorrespondente() {
		lista.add(new Pessoa("Nasser", LocalDate.parse("2023-07-07"))); //Nenhum
		lista.add(new Pessoa("Marcela", LocalDate.parse("1500-07-07"))); //Nenhum
		lista.add(new Pessoa("Marcelo", LocalDate.parse("2003-07-07"))); //Nenhum
		
		List<String> listaStrings = Desafio.retornaListaString(lista);
		
		assertEquals(true, listaStrings.isEmpty());
	}
	
	

}
