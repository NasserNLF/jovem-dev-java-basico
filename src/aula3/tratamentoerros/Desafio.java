package aula3.tratamentoerros;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import aula3.tratamentoerros.exceptions.VendaException;

public class Desafio {
	public static void main(String[] args) {
		new Desafio();
	}

	public Desafio() {
		Venda v = new Venda();

		v.setNomeCliente(JOptionPane.showInputDialog("CADASTRO DE VENDA\n\nDigite o nome do cliente!"));
		int qtdItens = Integer.parseInt(JOptionPane.showInputDialog("CADASTRO DE VENDAS\n\nQuantidade de itens!"));

		try {

			// Testando a primeira verificação
			if (qtdItens < 0 || qtdItens > 10) {
				throw new VendaException("Erro!\n\n	O número mínimo de itens é 1 e o máximo 10");
			}

			// Cadastrando os itens
			List<Item> itens = new ArrayList<>();
			
			do {				
				itens.add(cadVenda());
			} while (itens.size() < qtdItens);
			
			v.setItens(itens);
			
		} catch (VendaException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		
		//Saída dos dados
		String saida = "VENDA\n\nCliente: " + v.getNomeCliente() + "Itens:\n\n";
		
		for(Item i : v.getItens()) {
			saida += "Nome: " + i.getNome() + "\nValor R$" + i.getPreco() + "\n";
		}
		
		JOptionPane.showMessageDialog(null, saida);
		

	}

	public static Item cadVenda() {
		Item i = new Item();

		i.setNome(JOptionPane.showInputDialog("Digite o nome do item: "));
		
		do {
			try {
				i.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Preço do item")));
				if (i.getPreco() <= 0) {
					
				}
			}catch (RuntimeException e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
	
		}while(i.getPreco() <= 0);
		
		return i;
	}

}
