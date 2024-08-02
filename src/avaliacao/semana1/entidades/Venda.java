package avaliacao.semana1.entidades;

import java.util.List;

public class Venda {
	private Cliente cliente;
	private List<ItemVenda> itens;

	public Venda(Cliente cliente, List<ItemVenda> itens) {
		this.cliente = cliente;
		this.itens = itens;
	}

	public static Double subtotal(List<ItemVenda> itens) {
		Double subTotal = 0.0;
		
		// Cálculo
		for (ItemVenda i : itens) {
			subTotal += i.getProduto().getPreco();
		}
		
		return subTotal;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public List<ItemVenda> getItens() {
		return itens;
	}

}
