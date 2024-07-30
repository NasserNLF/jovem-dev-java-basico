package aula2.poo.exercicio2;

import javax.swing.JOptionPane;

public class Exercicio2 {
	public static void main(String[] args) {
		String primeiraFrase = JOptionPane
				.showInputDialog("PROGRAMA DE COMPARAÇÃO DE FRASES\n\nDigite a primeira frase: ");
		String segundaFrase = JOptionPane
				.showInputDialog("PROGRAMA DE COMPARAÇÃO DE FRASES\n\nDigite a segunda frase: ");

		if (primeiraFrase.equalsIgnoreCase(segundaFrase)) {
			JOptionPane.showMessageDialog(null,
					String.format("As frases são iguais!%nCada uma possuí %d caracteres", primeiraFrase.length()));
		} else {
			JOptionPane.showMessageDialog(null, String.format(
					"As frases não são iguais!%nA primeira possuí %d caraceteres%nA segunda possuí %d caracteres",
					primeiraFrase.length(), segundaFrase.length()));

		}

	}
}
