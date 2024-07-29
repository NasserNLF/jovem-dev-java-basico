package aula1.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Exercicio5 {
	public static void main(String[] args) {
		// Lista para receber os números iniciais
		List<Integer> lista1 = new ArrayList<Integer>();
		List<Integer> lista2 = new ArrayList<Integer>();

		// Conjunto para receber os valores dos dois sets
		Set<Integer> conjuntoIgual = new HashSet<Integer>();

		Random r = new Random();

		// Primeiro set
		for (int i = 0; i < 10; i++) {
			lista1.add(r.nextInt(30));
		}

		// Colocando os elementos no HashSet
		for (Integer i : lista1) {
			conjuntoIgual.add(i);
		}

		// Segundo set
		for (int i = 0; i < 10; i++) {
			lista2.add(r.nextInt(30));
		}

		// Colocando os elementos no HashSet
		for (Integer i : lista2) {
			conjuntoIgual.add(i);
		}

		System.out.println(conjuntoIgual);

	}

}
