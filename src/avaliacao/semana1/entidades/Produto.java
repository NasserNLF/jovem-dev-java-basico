package avaliacao.semana1.entidades;

public class Produto {
	private String nomeProd;
	private Double preco;
	
	public Produto(String nomeProd, Double preco) {
		this.nomeProd = nomeProd;
		this.preco = preco;
	}

	public String getNomeProd() {
		return nomeProd;
	}

	public Double getPreco() {
		return preco;
	}
	
	
}
