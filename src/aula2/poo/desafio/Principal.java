package aula2.poo.desafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		new Principal();
	}

	public Principal() {
		List<Carro> carros = new ArrayList<>();
		//Lista para ordenar os carros por ano
		List<Integer> anos = new ArrayList<>();
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
				anos.add(ano);
			}

		} while (!modelo.equalsIgnoreCase("fim"));
		
		//Ordenando os anos
		Collections.sort(anos);
		
		//Listando
//		for(Integer a: carros) {
//			
//		}
		
	}
}
