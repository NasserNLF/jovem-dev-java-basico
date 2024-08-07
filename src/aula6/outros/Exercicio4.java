package aula6.outros;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import javax.swing.JOptionPane;

public class Exercicio4 {
	public static void main(String[] args) {

		List<Pessoa> lista = new ArrayList<Pessoa>();

		for (int i = 1; i <= 2; i++) {
			String nome = JOptionPane.showInputDialog("Nome da pessoa " + i);
			String telefone = JOptionPane.showInputDialog("Telefone da pessoa " + i);
			LocalDate data = null;

			do {
				try {
					data = LocalDate.parse(JOptionPane.showInputDialog("Data de Nascimento da pessoa 1: (dd/MM/yyyy)"),
							DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Data inválida tente novamente!");
				}
			} while (data == null);

			Pessoa p = new Pessoa(nome, telefone, data);
			lista.add(p);
		}

		System.out.println(lista.stream().sorted(Comparator.comparing(Pessoa::getDataNasc)).findFirst());

	}
}
