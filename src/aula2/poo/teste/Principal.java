package aula2.poo.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		List<Carro> lista = new ArrayList<>();
		
		while(true) {
			String modelo = JOptionPane.showInputDialog("Digite o modelo:");
			if (modelo.equals("fim")) {
				break;
			}
			Integer ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano:"));
			lista.add(new Carro(modelo, ano));
		}

		Collections.sort(lista);
		
		for (Carro c : lista) {
			System.out.println(c);
		}
	}
}
