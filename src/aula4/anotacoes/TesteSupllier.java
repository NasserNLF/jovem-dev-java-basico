package aula4.anotacoes;

import java.util.function.Supplier;

public class TesteSupllier {
	public static void main(String[] args)  {
		System.out.println("Iniciando o cálculo");
		Supplier<String> s = ()-> consultaPesada();
		System.out.println("Fazendo o cálculo");
		System.out.println("Fazendo o cálculo");
		System.out.println("Fazendo o cálculo");
		System.out.println("Fazendo o cálculo");
		System.out.println("Fazendo o cálculo");
		System.out.println("Fazendo o cálculo");
		System.out.println("Fazendo o cálculo");
		System.out.println(s.get());
		
	}
	
	public static String consultaPesada(){
		try {
			
//			Thread.sleep(5000);
			
		} catch (Exception e) {
		}
		return "12000";
		
	}
}
