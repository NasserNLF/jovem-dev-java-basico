package aula4.anotacoes;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	public static void main(String[] args) {
		FunctionalInterfaceCalculadora c1= (v1, v2) -> v1 * v2;
		FunctionalInterfaceCalculadora c2 = (v1, v2) -> v1 / v2;
		FunctionalInterfaceCalculadora c3 = (v1, v2) -> Math.pow(v1, v2);
		
		System.out.println(c1.calcula(2.0, 3.0));
		System.out.println(c2.calcula(2.0, 3.0));
		System.out.println(c3.calcula(2.0, 3.0));
		
		List<String> lista = new ArrayList<>();
		lista.add("vasco");
		
		Principal p = new Principal();
		
		//Static
		lista.forEach(Principal::mostraMaiuscula);
		
		//Instância
		lista.forEach(p::mostraMinuscula);
		
		p.teste(lista);
		
	}
	
	public void teste(List<String> l) {
		l.forEach(this::mostraMinuscula);
	}
	
	//Static
	private static void mostraMaiuscula(String s) {
		System.out.println(s.toUpperCase());
	}
	
	private void mostraMinuscula(String s) {
		System.out.println(s.toLowerCase());
	}
	
	
}
