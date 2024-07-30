package aula1.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Exercicio2 {
	public static void main(String[] args) {

		// Números
		Random r = new Random();

		List<Integer> lista = new ArrayList<Integer>();

		// Adicionando números
		for (int i = 0; i < 50; i++) {
			lista.add(r.nextInt());
		}

		// Ordem crescente
		Collections.sort(lista);

		// Trazendo para ordem decrescente
		Collections.reverse(lista);

		System.out.println(lista);

	}
}
