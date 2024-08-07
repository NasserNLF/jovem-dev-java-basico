package aula6.outros;

import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.swing.JOptionPane;

public class Exercicio5 {
	public static void main(String[] args) {
		int valorCincunferencia = Integer.parseInt(
				JOptionPane.showInputDialog("Passe um valor inteiro que corresponda ao valor de uma circunferência:"));
		BigDecimal vlrCir = BigDecimal.valueOf(valorCincunferencia);
		BigDecimal div = BigDecimal.valueOf(2 * Math.PI);

		System.out.println("Valor do raio: " + calculaRaio(vlrCir, div));

	}
	
	public static BigDecimal calculaRaio(BigDecimal vlrCir, BigDecimal div) {
		return vlrCir.divide(div, 4, RoundingMode.HALF_EVEN);
	}
}
