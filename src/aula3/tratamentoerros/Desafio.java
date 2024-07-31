package aula3.tratamentoerros;

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
			//Testando a primeira verificação
			if (qtdItens < 0 || qtdItens > 10) {
				throw new VendaException("Erro!\n\n	O número mínimo de itens é 1 e o máximo 10");
			}
			
			
			
			
			
		} catch (VendaException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}

	}
	


}
