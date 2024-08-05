package aula5.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exercicio1 {
	public static void main(String[] args) {
		Random r = new Random();
		List<Integer> lista = new ArrayList<>();
		
		// Incluindo os números
		for(int i = 0; i < 50; i++) {
			lista.add(r.nextInt(100));
		}
		
		//Imprimindo os números
		System.out.println("Números sorteados:");
		lista.stream().forEach(System.out::println);
		
		//Imprimindo a soma
		System.out.println("Soma dos números: " +  lista.stream().mapToInt(Integer::intValue).sum());
		
		
	}
}
