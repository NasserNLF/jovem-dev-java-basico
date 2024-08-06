package aula4.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.JOptionPane;

public class Exercicio3 {
	public static void main(String[] args) {
		List<Aluno> alunos = new ArrayList<Aluno>();

		// Cadastro
		do {
			alunos.add(cadAluno());
		} while (alunos.size() < 2);

		// Preenchendo os números da chamada
		Collections.sort(alunos, Comparator.comparing(Aluno::getNome));
		for (int i = 0; i <= 5; i++) {
			alunos.get(i).setNumeroChamada(i + 1);
		}

		// Removendo os alunos cujo os nomes começam com a letra T e termine com a letra
		// O
		alunos.removeIf(a -> a.getNome().charAt(0) == 'T' && a.getNome().charAt(a.getNome().length() - 1) == 'O');

		// Preenchendo os números da chamada
		Collections.sort(alunos, Comparator.comparing(null));
		for (int i = 0; i <= alunos.size(); i++) {
			alunos.get(i).setNumeroChamada(i + 1);
		}

		// Saída
		alunos.forEach(System.out::println);
		
	}

	public static Aluno cadAluno() {
		Aluno a = new Aluno();

		a.setNome(JOptionPane.showInputDialog("Digite o nome do aluno").toUpperCase());
		a.setDataNascimento(); // Função criada para validação dentro da classe

		return a;

	}

}
