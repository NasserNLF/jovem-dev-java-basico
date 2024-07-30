package aula2.poo.exercicio4;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		new Principal();
	}
	
	public Principal() {
		String saida = "";
		List<Carro> listaCarros = new ArrayList<Carro>();
		
		
		JOptionPane.showMessageDialog(null, "Carro 1");
		listaCarros.add(cadastroCarro());
		JOptionPane.showMessageDialog(null, "Carro 2");
		listaCarros.add(cadastroCarro());
		JOptionPane.showMessageDialog(null, "Carro 3");
		listaCarros.add(cadastroCarro());
		
		for(int i = 0; i < listaCarros.size(); i++ ) {
			saida += String.format("Carro %d:%n%n"
					+ "Modelo: %s%n"
					+ "Ano: %d%n"
					+ "Cor: %s",
					(i+1), listaCarros.get(i).getModelo(), listaCarros.get(i).getAno(), listaCarros.get(i).getCor()) + "\n\n";
		}
		
		JOptionPane.showMessageDialog(null, saida);
		
	}
	
	public static Carro cadastroCarro() {
		Carro c = new Carro();
		
		c.setModelo(JOptionPane.showInputDialog("Digite o modelo do carro: "));
		c.setAno(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do carro: ")));
		c.setCor(JOptionPane.showInputDialog("Digite a cor do carro: "));
		
		return c;
	}
}
