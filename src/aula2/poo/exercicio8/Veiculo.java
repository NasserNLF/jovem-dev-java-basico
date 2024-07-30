package aula2.poo.exercicio8;

public abstract class Veiculo {
	
	private String nome;
	private String cor;
	private Double velocidade;
	

	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getCor() {
		return cor;
	}



	public void setCor(String cor) {
		this.cor = cor;
	}



	public Double getVelocidade() {
		return velocidade;
	}



	public void setVelocidade(Double velocidade) {
		this.velocidade = velocidade;
	}



	@Override
	public String toString() {
		return getNome() + "\n" + getCor() + "\n" + getVelocidade() + " KM/H\n"; 
	}


	public abstract void acelerar();
	
	
}
