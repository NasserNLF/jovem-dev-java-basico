package aula2.poo.desafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		new Principal();
	}

	public Principal() {
		List<Carro> carros = new ArrayList<>();
		// Lista para ordenar os carros por ano
		String modelo = "";

		do {
			modelo = JOptionPane.showInputDialog(
					"PROGRAMA DE ANÁLISE DE CARROS\n\n" + "Digite o modelo do carro:\n(FIM para parar)");
			if (!modelo.equalsIgnoreCase("fim")) {
				int ano = Integer.parseInt(
						JOptionPane.showInputDialog("PROGRAMA DE ANÁLISE DE CARROS\n\n" + "Digite o ano do carro:"));
				Carro c = new Carro();
				// Setando os atributos do objeto
				c.setModelo(modelo);
				c.setAno(ano);
				carros.add(c);
			}

		} while (!modelo.equalsIgnoreCase("fim"));

		boolean fim = false;
		// Ordenando os carros
		do {
			// Primeiro valor
			int pos = 0;
			// Segundo valor
			int aux = 0;
			do {
				do {
					if (carros.get(pos).getAno() <= carros.get(aux).getAno()) {
						aux++;
					} else {
						fim = true;
					}
				} while (!fim && aux < carros.size());
				if (aux == carros.size()) {
					System.out.println(
							"Ano: " + carros.get(pos).getModelo() + "\nModelo: " + carros.get(pos).getAno() + "\n");
					fim = false;
					carros.remove(pos);
				} else {
					pos++;
				}
			} while (pos < carros.size() && fim);
			
		} while (!carros.isEmpty());
	
	}
}
