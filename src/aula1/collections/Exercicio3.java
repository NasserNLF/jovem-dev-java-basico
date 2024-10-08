package aula1.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Exercicio3 {
	public static void main(String[] args) {

		Random r = new Random();

		List<Integer> conjuntoTodos = new ArrayList<>();
		Set<Integer> conjuntoSemRepeticao = new HashSet<Integer>();

		// Declaração de valores sem estrutura de repetição
		for (int i = 0; i < 50; i++) {
			conjuntoTodos.add(r.nextInt(20));
		}

		// Ordenando os elementos
		Collections.sort(conjuntoTodos);
		System.out.println("Original: " + conjuntoTodos);

		// Inserindo no conjunto os números sem deixando repetir
		conjuntoSemRepeticao.addAll(conjuntoTodos);

		System.out.println("Sem repetições: " + conjuntoSemRepeticao);

	}
}
