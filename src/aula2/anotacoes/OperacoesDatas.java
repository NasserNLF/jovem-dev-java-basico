package aula2.anotacoes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class OperacoesDatas {
	public static void main(String[] args) {
		// Cria a data
		LocalDate nascimento = LocalDate.of(1984, 6, 28);
		System.out.println(nascimento);

		// Criando data por meio de uma String
		LocalDate parseado = LocalDate.parse("1999-05-20");
		System.out.println(parseado);

		// Agora
		LocalDate agora = LocalDate.now();
		System.out.println(agora);

		// Formatando para o "jeitinho brasileiro"
		System.out.println(agora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

		// Pega com as horas
		LocalDateTime agoraHora = LocalDateTime.now();
		System.out.println(agoraHora.format(DateTimeFormatter.ofPattern("MM")));

		// Passando uma data
		LocalDateTime compromisso = LocalDateTime.of(2024, 8, 10, 5, 0);
		System.out.println(compromisso);
		
		//Fazendo a conversão para o armazenamento
		String dataString = JOptionPane.showInputDialog("Passe uma data:");
		LocalDate data = LocalDate.parse(dataString, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println(data);
	}
}
