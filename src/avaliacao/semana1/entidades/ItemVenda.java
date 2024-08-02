package avaliacao.semana1.entidades;

public class ItemVenda{
	private Produto produto;
	private Integer qtd;
	
	public ItemVenda(Produto produto, Integer qtd) {
		this.produto = produto;
		this.qtd = qtd;
	}

	public Produto getProduto() {
		return produto;
	}

	public Integer getQtd() {
		return qtd;
	}
	
	
}
