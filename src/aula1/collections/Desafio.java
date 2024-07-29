package aula1.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;

public class Desafio {
	public static void main(String[] args) {

		Map<Character, String> listaFinal = new HashMap<>();
		// ArrayList para auxiliar na inclusão e ordenamento
		List<String> listaPalavras = new ArrayList<>();
		List<Character> listaCaracteres = new ArrayList<>();
		
		listaCaracteres.add('a');
		listaCaracteres.add('e');
		listaCaracteres.add('i');
		listaCaracteres.add('o');
		listaCaracteres.add('u');
		
		
		String palavra = "";

		// Preenchimento das palavraas
		do {
			palavra = JOptionPane
					.showInputDialog("Coloque qualquer palavra: \n" + "(Para finalizar escreva a palavra 'fim'")
					.toLowerCase();

			if (!palavra.equals("fim")) {
				listaPalavras.add(palavra);
			}

		} while (!palavra.equals("fim"));

		listaPalavras.sort(null);

		// Declaração inicial
		listaFinal.put('a', "");
		listaFinal.put('e', "");
		listaFinal.put('i', "");
		listaFinal.put('o', "");
		listaFinal.put('u', "");

		for (String s : listaPalavras) {
			if (s.contains("a")) {
				listaFinal.computeIfPresent('a', (key, val) -> val + s + " ");
			}
			if (s.contains("e")) {
				listaFinal.computeIfPresent('e', (key, val) -> val + s + " ");
			}
			if (s.contains("i")) {
				listaFinal.computeIfPresent('i', (key, val) -> val + s + " ");
			}
			if (s.contains("o")) {
				listaFinal.computeIfPresent('o', (key, val) -> val + s + " ");
			}
			if (s.contains("u")) {
				listaFinal.computeIfPresent('u', (key, val) -> val + s + " ");
			}

		}
		
		
		String saida = "";
		
		for(Character c: listaCaracteres) {
			saida += c.toString() + " " + listaFinal.get(c) + "\n";
		}
		
		System.out.println(saida);

	}
}
