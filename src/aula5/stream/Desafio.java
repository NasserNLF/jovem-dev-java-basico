package aula5.stream;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Desafio {
	public static void main(String[] args) {

		List<Pessoa> lista = new ArrayList<Pessoa>();
		// Criando as pessoa
		lista.add(new Pessoa("Nasser", LocalDate.parse("2004-12-07")));
		lista.add(new Pessoa("Ana", LocalDate.parse("2004-11-07")));
		lista.add(new Pessoa("João", LocalDate.parse("2004-10-07")));
		lista.add(new Pessoa("Nicolas",  LocalDate.parse("2004-09-07")));
		lista.add(new Pessoa("Felipe",  LocalDate.parse("2004-08-07")));
		lista.add(new Pessoa("Thiago", LocalDate.parse("2004-05-07")));
		lista.add(new Pessoa("Igor",  LocalDate.parse("2004-05-07")));
		lista.add(new Pessoa("Nacim", LocalDate.parse("2004-05-07")));
		lista.add(new Pessoa("Patricia",  LocalDate.parse("2004-01-07")));
		lista.add(new Pessoa("Messi",  LocalDate.parse("2004-02-07")));
		
		
		
		System.out.println(lista.stream()
				.filter(s -> s.getNome().matches("[AEIOU]") || ((s.getDataNasc().getYear() % 4 == 0 && s.getDataNasc().getYear() % 100 != 0) || s.getDataNasc().getYear() % 400 == 0)));
	
	}
}
