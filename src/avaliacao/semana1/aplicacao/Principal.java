package avaliacao.semana1.aplicacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import avaliacao.semana1.entidades.Cliente;
import avaliacao.semana1.entidades.ClientePremium;
import avaliacao.semana1.entidades.ItemVenda;
import avaliacao.semana1.entidades.Produto;
import avaliacao.semana1.entidades.Venda;

public class Principal {

	/*
	 * O programa está "funcional" porém acho que da pior maneira possível, porém
	 * não consegui implementar algumas coisas que o professor pediu
	 */

	public static String cupom = "*****Cupom*****\n\n";

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "BEM-VINDO\n\nSISTEMA DE VENDAS");
		Cliente cliente = cadCliente();
		Venda venda = cadVenda(cliente);

		// Cupom do cliente
		JOptionPane.showMessageDialog(null, montaCupom(cliente, venda));

	}

	// Cadastro Cliente
	public static Cliente cadCliente() {

		String nomeCliente = JOptionPane.showInputDialog("CADASTRO DO CLIENTE!\n\nQual o seu nome?").toUpperCase();
		LocalDate dataNasc = null;

		// Verificando se é uma Data válida - Não Verificada
		do {
			try {
				dataNasc = LocalDate.parse(JOptionPane.showInputDialog("Qual a sua data de Nascimento? (dd/MM/yyyy)"),
						DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Data no formato inválido!\nTente novamente!");
			}
		} while (dataNasc == null);

		// Verificação do cliente Premium
		if (nomeCliente.equals("THIAGO")) {
			return new ClientePremium(nomeCliente, dataNasc);
		}

		return new Cliente(nomeCliente, dataNasc);
	}

	// Cadastro Venda
	public static Venda cadVenda(Cliente cliente) {
		String nomeProd = null;
		List<ItemVenda> itens = new ArrayList<>();
		do {
			nomeProd = JOptionPane.showInputDialog("CARRINHO DE COMPRAS\n\nDigite o nome do produto: (FIM para parar)")
					.toUpperCase();
			Double preco = 0.0;
			Integer qtd = 0;

			if (!nomeProd.equals("FIM")) {
				// Verificação do preço do produto
				do {
					try {
						preco = Double.parseDouble(JOptionPane.showInputDialog("Valor do Produto: "));
					} catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "Valor inválido!\n\nTente novamente!");
					}
				} while (preco <= 0);

				// Verificação da quantidade
				do {
					try {
						qtd = Integer.parseInt(JOptionPane.showInputDialog("Quantidade: "));
					} catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "Quantidade inválida!\nQuant Máx: 50\nQuant Mín: 0");
					}
				} while (qtd <= 0 && qtd >= 50);

				// Contrução do Objeto Produto
				Produto produto = new Produto(nomeProd, preco);

				// Criando o item da venda
				ItemVenda itemVenda = new ItemVenda(produto, qtd);

				// Adicionando os itens no "carrinho"
				itens.add(itemVenda);
			} else if (itens.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Você deve pelo menos escolher um produto!");
			}

		} while (!nomeProd.equals("FIM") || itens.isEmpty());

		return new Venda(cliente, itens);
	}

	// Analisando forma de pagamento
	public static String formaPagamento() {
		Integer forma = 0;

		do {
			try {
				forma = Integer.parseInt(JOptionPane
						.showInputDialog("FORMA DE PAGAMENTO\n\n1) Cartão de Crédito\n2) Cartão de Débito\n3) Dinheiro"));
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Valor inserido inválido! Tente novamente!");
			}
		} while (forma == 0);

		switch (forma) {
		case 1:
			return "Cartão de Crédito";
		case 2:
			return "Cartão de Débito";
		case 3:
			return "Dinheiro";
		default:
			JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente!");
			return formaPagamento();
		}

	}

	// Fazendo o cupom
	public static String montaCupom(Cliente cliente, Venda venda) {
		for (ItemVenda i : venda.getItens()) {
			cupom += i.getProduto().getNomeProd() + "\n" + i.getQtd() + "x" + i.getProduto().getPreco() + ".........."
					+ (i.getQtd() * i.getProduto().getPreco()) + "\n";
		}

		// Subtotal
		cupom += "\n" + "Subtotal ..............." + subTotal(venda.getItens());

		Double desc = desc(cliente);
		if (desc == 0.2) {
			cupom += "\nDescto. 20% Cliente Premium";
		} else if (desc == 0.3) {
			cupom += "\nDescto. 30% Cliente Aniversariante";
		} else if (desc == 0.1) {
			cupom += "\nDescto. 10% Terceira Idade";
		} else {
			cupom += "\nSem desconto";
		}

		cupom += "\n\nTotal: ..............." + (subTotal(venda.getItens()) - (subTotal(venda.getItens()) * desc));
		cupom += "\nForma de Pagamento: " + formaPagamento();

		cupom += "\nCliente: ";
		for (int i = 0; i < cliente.getNomeCliente().length(); i++) {
			if (i == 0) {
				cupom += cliente.getNomeCliente().charAt(i);
			} else if (cliente.getNomeCliente().charAt(i) == ' ') {
				cupom += " ";
			} else {
				cupom += "*";
			}
		}

		return cupom;
	}

	// Calculando o subtotal
	public static Double subTotal(List<ItemVenda> itens) {
		Double subTotal = 0.0;
		for (ItemVenda i : itens) {
			subTotal += (i.getProduto().getPreco()) * (i.getQtd());
		}
		return subTotal;
	}

	// Desconto
	public static Double desc(Cliente cliente) {
		LocalDate agora = LocalDate.now();
		if (cliente.getNomeCliente().equals("THIAGO")) {
			return 0.2;
		}
		if (cliente.getDataNasc().getMonth() == agora.getMonth()
				&& cliente.getDataNasc().getDayOfMonth() == agora.getDayOfMonth()) {
			return 0.3;
		}
		if ((2024 - cliente.getDataNasc().getYear()) >= 60) {
			return 0.1;
		}
		return 0.0;
		
	}

}
