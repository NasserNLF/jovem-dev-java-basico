package aula4.anotacoes;

import java.util.ArrayList;
import java.util.List;

public class TesteConsumer {
	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		lista.add("abc");
		lista.add("bcd");
		lista.add("vasco");
		//Consumer
		lista.forEach(System.out::println);
	}
}
