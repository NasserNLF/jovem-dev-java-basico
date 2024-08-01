package aula4.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.JOptionPane;

public class Exercicio2 {
	public static void main(String[] args) {
		List<Aluno> alunos = new ArrayList<>();

		do {
			alunos.add(cadAluno());
		} while (alunos.size() < 5);

		// Preenchendo a ordem da chamada | Criando o comparador
		Collections.sort(alunos, Comparator.comparing(Aluno::getNome));
		for (int i = 0; i <= alunos.size(); i++) {
			alunos.get(i).setNumeroChamada(i + 1);
		}

		// Ordenando para mostrar por idade | Criando o comparador
		Collections.sort(alunos, Comparator.comparing(Aluno::getDataNascimento));

		// Mostrando o resultado final
		alunos.forEach(System.out::println);

	}

	public static Aluno cadAluno() {
		Aluno a = new Aluno();

		a.setNome(JOptionPane.showInputDialog("Digite o nome do aluno"));
		a.setDataNascimento(); // Função criada para validação dentro da classe

		return a;

	}
}
