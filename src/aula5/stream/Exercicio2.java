package aula5.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exercicio2 {
	public static void main(String[] args) {
		Random r = new Random();
		List<Integer> lista = new ArrayList<>();

		// Incluindo os números
		for (int i = 0; i < 50; i++) {
			lista.add(r.nextInt(100));
		}

		// Listando os números
		System.out.println("Números: ");
		lista.stream().forEach(System.out::println);

		System.out.println("Média dos números maiores que 50: "
				+ lista.stream().filter(i -> i > 50).mapToInt(Integer::intValue).average());

	}
}
