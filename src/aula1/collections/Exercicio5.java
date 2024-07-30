package aula1.collections;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Exercicio5 {
	public static void main(String[] args) {
		Random r = new Random();
		Set<Integer> lista1 = new HashSet<>();
		Set<Integer> lista2 = new HashSet<>();

		for (int i = 0; i < 10; i++) {
			lista1.add(r.nextInt(30));
		}

		for (int i = 0; i < 10; i++) {
			lista2.add(r.nextInt(30));
		}

		System.out.println("Lista 1: " + lista1);
		System.out.println("Lista 2: " + lista2);

		// Método para juntar a intersecção
		lista1.retainAll(lista2);

		// Averiguar se precisava de ordenação
		System.out.println("Lista com intersecção: " + lista1);
	}

}
