package aula2.poo.exercicio6;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		new Principal();
	}

	public Principal() {

		Pessoa p = new Pessoa();
		PessoaFisica pf = new PessoaFisica();

		JOptionPane.showMessageDialog(null, "Programa para averiguar mais novo!");

		// Pessoa
		JOptionPane.showMessageDialog(null, "Pessoa 1");
		p.setNome(JOptionPane.showInputDialog("Nome: "));
		p.setDataNasc(LocalDate.parse(JOptionPane.showInputDialog("Data de nascimento: (dd/MM/yyyy)"),
				DateTimeFormatter.ofPattern("dd/MM/yyyy")));

		// Pessoa Física
		JOptionPane.showMessageDialog(null, "Pessoa 2");
		pf.setNome(JOptionPane.showInputDialog("Nome: "));
		pf.setDataNasc(LocalDate.parse(JOptionPane.showInputDialog("Data de nascimento: (dd/MM/yyyy)"),
				DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		pf.setCpf(JOptionPane.showInputDialog("CPF: "));

		// Verificando
		if (p.getDataNasc().isAfter(pf.getDataNasc())) {
			JOptionPane.showMessageDialog(null,
					String.format("Os dados do mais novo:%n" + "Nome: %s%n" + "Data de Nascimento: %s%n", p.getNome(),
							p.getDataNasc()));
		} else if (pf.getDataNasc().isAfter(p.getDataNasc())) {
			JOptionPane.showMessageDialog(null,
					String.format("Os dados do mais novo:%n" + "Nome: %s%n" + "Data de Nascimento: %s%n" + "CPF: %s",
							pf.getNome(), pf.getDataNasc(), pf.getCpf()));
		} else {
			JOptionPane.showMessageDialog(null, "Os dois possuem idades iguais!");
		}

	}

}
