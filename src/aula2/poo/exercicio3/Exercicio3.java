package aula2.poo.exercicio3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class Exercicio3 {
	public static void main(String[] args) {
		// Pedindo a data
		LocalDate data = LocalDate.parse(JOptionPane.showInputDialog("Digite uma data: (dd/MM/yyyy)"),
				DateTimeFormatter.ofPattern("dd/MM/yyyy"));

		// Mostrando a data
		JOptionPane.showMessageDialog(null, "A data ocorreu em uma (INGLÊS) " + data.getDayOfWeek());
	}
}
