package aula5.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exercicio3 {
	public static void main(String[] args) {
		Random r = new Random();
		List<Integer> lista = new ArrayList<>();

		// Incluindo os números
		for (int i = 0; i < 50; i++) {
			lista.add(r.nextInt(100));
		}
		
		// Listando os números
		System.out.println("Números sorteados:");
		lista.stream().forEach(System.out::println);
		
		System.out.println("Quantidade de números 25 na lista: " + contaMaior25(lista));

	}
	
	public static long contaMaior25(List<Integer> lista) {
		return lista.stream().filter(i -> i == 25).count();
	}
}
