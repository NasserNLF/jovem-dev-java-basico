package aula5.stream;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Desafio {
	public static void main(String[] args) {

		List<Pessoa> lista = new ArrayList<Pessoa>();
		// Criando as pessoa
		lista.add(new Pessoa("Nasser", LocalDate.parse("1960-12-07")));
		lista.add(new Pessoa("Ana", LocalDate.parse("2010-11-07")));
		lista.add(new Pessoa("João", LocalDate.parse("2011-10-07")));
		lista.add(new Pessoa("Nicolas", LocalDate.parse("2013-09-07")));
		lista.add(new Pessoa("Felipe", LocalDate.parse("2015-08-07")));
		lista.add(new Pessoa("Thiago", LocalDate.parse("2020-05-07")));
		lista.add(new Pessoa("Igor", LocalDate.parse("2024-05-07")));
		lista.add(new Pessoa("Nacim", LocalDate.parse("1600-05-07")));
		lista.add(new Pessoa("Patricia", LocalDate.parse("1400-01-07")));
		lista.add(new Pessoa("Messi", LocalDate.parse("2000-02-07")));

		//Utilizando Regex
		lista.stream().filter(p -> p.getNome().matches("^[AEIOU].*") || (p.getDataNasc().getYear() % 4 == 0 && (p.getDataNasc().getYear() % 100 != 0 || p.getDataNasc().getYear() % 400 == 0)))
				.sorted(Comparator.comparing(Pessoa::getNome).reversed()).forEach(System.out::println);
		
		

	}
}
