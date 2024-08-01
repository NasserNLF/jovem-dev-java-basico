package aula3.tratamentoerros;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exercicio3 {
	public static void main(String[] args) {
		new Exercicio3();
	}

	@SuppressWarnings("null")
	public Exercicio3() {

		// ArithmeticException
		try {
			int a = 0;
			int b = 0;
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}

		// NullPointerException
		try {
			String s = null;
			s.equals("Teste");
		} catch (NullPointerException e) {
			e.printStackTrace();
		}

		// StringIndexOutOfBoundsException

		try {
			System.out.println("teste".charAt(-1));
		} catch (StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		
		//Não consegui fazer
		//IllegalStateException
		try {
			 List<String> nomes = new ArrayList<>();
			 nomes.add("Nasser");
			 nomes.add("Ana");
			 
			 Iterator<String> iterator = nomes.iterator();
			 
			 while(iterator.hasNext()) {
				 String nome = iterator.next();
				 System.out.println(nome);
				 if ("Ana".equals(nome)) {
					nomes.remove(nome);
				}
			 }
			 
		} catch (IllegalStateException e) {
			e.printStackTrace();
		}

	}

}
