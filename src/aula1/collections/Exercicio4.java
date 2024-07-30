package aula1.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;

public class Exercicio4 {
	public static void main(String[] args) {

		Map<Character, Integer> mapa = new HashMap<>();
		// Lista para auxiliar na ordenação
		List<Character> listaCaracteres = new ArrayList<>();
		String frase = JOptionPane.showInputDialog("Coloque uma frase: ").trim();

		for (int i = 0; i < frase.length(); i++) {
			// Irá verificar se a chave já existe
			if (mapa.containsKey(frase.charAt(i))) {
				// Irá incrementar o valor sem apagar o que já existe
				mapa.computeIfPresent(frase.charAt(i), (key, val) -> val + 1);
			} else {
				mapa.put(frase.charAt(i), 1);
				listaCaracteres.add(frase.charAt(i));
			}
		}

		String saida = "";

		// Lembrar de perguntar como colocar o espaco como ultimo na fila
		for (Character c : listaCaracteres) {
			saida += c.toString() + " - " + mapa.get(c) + ", ";
		}

		System.out.println(saida);

	}
}
