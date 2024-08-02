package aula4.anotacoes;

import java.util.ArrayList;
import java.util.List;

public class TestePredicate {
	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		
		lista.add("abc");
		lista.add("abc");
		lista.add("cbc");
		lista.add("dbc");
		lista.add("ebc");
		
		//Predicate - Percorre internamente
		lista.removeIf(s -> s.charAt(0) == 'a');
		lista.forEach(System.out::println);
		
	}
}
