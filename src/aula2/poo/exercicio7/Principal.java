package aula2.poo.exercicio7;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		new Principal();
	}

	public Principal() {
		NotaFiscal n1 = new NotaFiscal();
		NotaFiscal n2 = new NotaFiscal();

		// Simulação
		n1.setEmitente("Trier");
		n2.setEmitente("Trier");

		n1.calculaValor(Double.parseDouble(JOptionPane.showInputDialog("Nota Fiscal 1:\n\nValor bruto do produto:")),
				Double.parseDouble(JOptionPane.showInputDialog("Nota Fiscal 1:\n\nPorcentagem do desconto:")));
		
		n2.calculaValor(Double.parseDouble(JOptionPane.showInputDialog("Nota Fiscal 2:\n\nValor bruto do produto:")),
				Double.parseDouble(JOptionPane.showInputDialog("Nota Fiscal 2:\n\nPorcentagem do desconto:")));
		
		//Saída
		JOptionPane.showMessageDialog(null, "Nota Fiscal 1\n\nEmitente: " + n1.getEmitente() + "\nValor: " + n1.getValor());
		JOptionPane.showMessageDialog(null, "Nota Fiscal 2\n\nEmitente: " + n2.getEmitente() + "\nValor: " + n2.getValor());

	}

}
