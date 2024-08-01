package aula4.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exercicio1 {
	public static void main(String[] args) {
		Random r = new Random();
		List<Integer> lista = new ArrayList<Integer>();

		for (int i = 0; i < 50; i++) {
			lista.add(r.nextInt(100));
		}

		System.out.println("Números sorteados: ");
		lista.forEach(System.out::println);

	}
}
