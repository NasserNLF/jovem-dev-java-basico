package aula2.poo.exercicio5;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		new Principal();
	}

	public Principal() {
		List<Pessoa> listaPessoas = new ArrayList<Pessoa>();

		JOptionPane.showMessageDialog(null, "Pessoa 1");
		listaPessoas.add(cadPessoa());
		JOptionPane.showMessageDialog(null, "Pessoa 2");
		listaPessoas.add(cadPessoa());

		JOptionPane.showMessageDialog(null ,verificaMaisVelha(listaPessoas));

	}

	public static Pessoa cadPessoa() {
		Pessoa p = new Pessoa();

		p.setNome(JOptionPane.showInputDialog("Nome da pessoa: "));
		LocalDate dt = LocalDate.parse(JOptionPane.showInputDialog("Data de nascimento da pessoa: (dd/MM/yyyy)"),
				DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		p.setDataNasc(dt);

		return p;

	}

	public static String verificaMaisVelha(List<Pessoa> listaPessoas) {
		LocalDate d = LocalDate.now();
		Pessoa pessoaMaisVelha = null;
		for (Pessoa p : listaPessoas) {
			if (p.getDataNasc().isBefore(d) || pessoaMaisVelha == null) {
				pessoaMaisVelha = p;
				d = p.getDataNasc();
			}
		}
		// Achei a classe Period como o melhor método para calcular idade
		return "A pessoa mais velha é " + pessoaMaisVelha.getNome() + " com "
				+ Period.between(pessoaMaisVelha.getDataNasc(), LocalDate.now()).getYears() + " anos";
	}
}
