package aula4.lambda;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Desafio {
	public static void main(String[] args) {
		List<String> strings = new ArrayList<String>();

		do {
			strings.add(cadStrings());
		} while (strings.size() < 5);

		Mostrador m1 = s -> System.out.println(s.toUpperCase());

		strings.forEach(m1::mostraStringMaiuscula);

	}

	public static String cadStrings() {
		return JOptionPane.showInputDialog("Digite uma String qualquer");
	}
}
