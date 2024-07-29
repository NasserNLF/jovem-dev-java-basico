package aula1.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;

public class Exercicio4 {
	public static void main(String[] args) {
		Map<Character, Integer> mapa = new HashMap<Character, Integer>();
		
		//Lista para ordenar conforme a frase
		List<Character> chaves = new ArrayList<Character>();

		String frase = JOptionPane.showInputDialog("Digite uma frase: ").trim();

		// Loop para pegar as letras da frase
		for (int i = 0; i < frase.length(); i++) {
			int aux = 0;
			if (mapa.containsKey(frase.charAt(i))) {
				aux = mapa.get(frase.charAt(i)); // Recebe o valor que está na chave
				mapa.remove(frase.charAt(i)); // Remove a chave
				mapa.put(frase.charAt(i), aux + 1); // Cria a chave novamente acrecentando o valor antigo
			} else {
				mapa.put(frase.charAt(i), 1);
				chaves.add(frase.charAt(i)); // A
			}
		}
		
		String aux = "";
		
		for(Character c : chaves) {
			aux += c.toString() + "-" + mapa.get(c) + ", ";
		}
		
		System.out.println(aux);
	}
}
