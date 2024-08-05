package aula5.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import aula5.stream.exceptions.ZeroBertoException;

public class Exercicio5 {
	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();

		lista.add("Nasser");
		lista.add("Hum");
		lista.add("Ana");
		lista.add("Vitória");
		lista.add("Lucas");
		lista.add("Nicolas");
		lista.add("Felix");
		lista.add("Gabriel");
		lista.add("Leticia");
		lista.add("João");

		
//		Optional<List<String>> opt = Optional.ofNullable(null)
		
//		System.out.println(opt.orElseThrow(() -> new ZeroBertoException("Não há nomes terminados com berto")));
		

	}
}
