package aula3.tratamentoerros;

import javax.swing.JOptionPane;

public class Exercicio1 {
	public static void main(String[] args) {
		new Exercicio1();
	}

	public Exercicio1() {

		Integer i = null;

		// loop
		do {
			i = verificaInteiro();
		} while (i == null);

		System.out.println("Você digitou um número válido!");
		
		System.out.println("Fim de programa");
	}

	// Função para verificar inteiro
	public static Integer verificaInteiro() throws NumberFormatException {
		try {
			return Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
		} catch (Exception e) {
			System.out.println("Você digitou um valor não reconhecido");
			return null;
		}
	}
}
