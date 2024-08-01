package aula4.anotacoes;

import java.util.ArrayList;
import java.util.List;

public class TesteFunction {
	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		lista.add("vasco");
		lista.add("vasco");
		
		lista.stream().map(s -> s.length()).forEach(System.out::println);
		
		
	}
}
