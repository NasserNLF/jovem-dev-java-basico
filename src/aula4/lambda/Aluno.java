package aula4.lambda;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class Aluno {
	private String nome;
	private Integer numeroChamada;
	private LocalDate dataNascimento;

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getNumeroChamada() {
		return numeroChamada;
	}

	public void setNumeroChamada(Integer numeroChamada) {
		this.numeroChamada = numeroChamada;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	
	//Validação da formatação de data
	public void setDataNascimento() {
		do {
			String dataString = JOptionPane.showInputDialog("Digite a data de nascimento do aluno: (dd/MM/yyyy");
			try {
				this.dataNascimento = LocalDate.parse(dataString, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Data inserida inválida!\nInsira novamente!");
			}
		} while (this.dataNascimento == null);

	}
	
	
	@Override
	public String toString() {
		return "Aluno: " + nome + "\nNúmero da chamada: " + numeroChamada + "\nData de nascimento: " + dataNascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "\n";
	}

}
