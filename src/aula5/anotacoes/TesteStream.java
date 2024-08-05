package aula5.anotacoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class TesteStream {
	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();
		lista.add("a");
		lista.add("b");
		lista.add("c");
		lista.add("dSASA");
		lista.add("e");
		lista.add("a");
		
//		//Operação intermediária map
//		lista.stream().map(letra -> letra.toUpperCase()).forEach(System.out::println);
		
//		//Operação intermediária filter
//		lista.stream().filter(elemento -> elemento.startsWith("a")).forEach(System.out::println);
		
//		//Operação intermediária Limit
//		lista.stream().limit(3).filter(elemento -> elemento.startsWith("a")).forEach(System.out::println);
		
		lista.stream().filter(Objects::nonNull).filter(elemento -> elemento.startsWith("a")).forEach(System.out::println);
		
		/*
		 * Operações terminais
		 */
		
		//Operação terminal Count
		System.out.println(lista.stream().filter(Objects::nonNull).filter(elemento -> elemento.startsWith("a")).count());
		
		//Operação terminal FindAny/FindFirts
		System.out.println(lista.stream().filter(Objects::nonNull).filter(elemento -> elemento.startsWith("a")).findFirst());
		
		//AnyMatch, NoMatch, AllMatch
		System.out.println(lista.stream().filter(Objects::nonNull).filter(elemento -> elemento.startsWith("a")).anyMatch(elemento -> elemento.length() == 1));
		
		//Collect transforma em uma ista
		List<String> resultado = lista.stream().filter(Objects::nonNull).filter(elemento -> elemento.startsWith("a")).collect(Collectors.toList());
		
		System.out.println(resultado);
		
		/*
		 * Tipos de Map
		 */
		
		//MapInt
		System.out.println(lista.stream().filter(Objects::nonNull).mapToInt(String::length).average());
		
		
	}
}
