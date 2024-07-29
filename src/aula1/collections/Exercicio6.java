package aula1.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;

public class Exercicio6 {
	public static void main(String[] args) {
		// Lista de notas
		
		List<Double> notas1 = new ArrayList<Double>();
		List<Double> notas2 = new ArrayList<Double>();
		List<Double> notas3 = new ArrayList<Double>();
		
		//Lista de alunos
		List<String> alunos = new ArrayList<String>();

		// Mapa
		Map<String, List<Double>> alunosNotas = new HashMap<String, List<Double>>();

		// Cadastro

		alunos.add(cadAluno());
		
		alunosNotas.put(alunos.get(0), cadNotas(notas1));

		alunos.add(cadAluno());

		alunosNotas.put(alunos.get(1), cadNotas(notas2));

		alunos.add(cadAluno());

		alunosNotas.put(alunos.get(2), cadNotas(notas3));

		System.out.println(alunos.get(0) + " " +alunosNotas.get(alunos.get(0)) + "Média: " + calculaMedia(notas1) + " \n" + alunos.get(1) + " " + alunosNotas.get(alunos.get(1)) + "Média: "
				+ calculaMedia(notas2) + " \n" + alunos.get(2) + " " +  alunosNotas.get(alunos.get(2)) + "Média: " + calculaMedia(notas3) + " \n");

	}

	public static String cadAluno() {
		String nome = JOptionPane.showInputDialog("Nome do aluno: ");
		return nome;
	}

	public static List<Double> cadNotas(List<Double> notas) {
		for (int i = 0; i < 3; i++) {
			notas.add(Double.parseDouble(JOptionPane.showInputDialog("Nota " + (i + 1) + ":")));
		}
		return notas;
	}

	public static double calculaMedia(List<Double> notas) {
		double soma = 0;
		for (Double d : notas) {
			soma += d;
		}
		return soma / 3;
	}
}
