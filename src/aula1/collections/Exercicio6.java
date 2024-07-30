package aula1.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;

public class Exercicio6 {
	public static void main(String[] args) {
		String saida = "";

		// Mapa
		Map<String, List<Double>> mapa = new HashMap<>();

		for (int i = 0; i < 5; i++) {
			List<Double> listaNotas = new ArrayList<>();
			String nome = JOptionPane.showInputDialog("Nome do aluno " + (i + 1) + ":");
			for (int j = 0; j < 3; j++) {
				listaNotas.add(Double.parseDouble(JOptionPane.showInputDialog("Nota " + (j + 1) + ":")));
			}
			mapa.put(nome, listaNotas);
		}

		// Percorrendo cada elemento para fazer a saída
		for (String key : mapa.keySet()) {
			double soma = 0;
			saida += "Aluno: " + key + "\nNotas: ";
			for (Double d : mapa.get(key)) {
				saida += d + " ";
				soma += d;
			}
			saida += String.format("%nMédia: %.2f%n%n", soma / 3);
		}

		JOptionPane.showMessageDialog(null, saida);
	}

}
