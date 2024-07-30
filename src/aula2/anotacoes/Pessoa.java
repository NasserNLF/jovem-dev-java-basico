package aula2.anotacoes;

public class Pessoa {

	// Private apenas a classe vê
	private String nome;
	private double altura;
	// Permite apenas pela "família"
	protected String corDoOlho;

	// Padrão
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	

}
