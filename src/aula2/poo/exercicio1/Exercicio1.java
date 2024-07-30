package aula2.poo.exercicio1;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Numero com virgula
		System.out.println("Digite um número com vírgula: ");
		double numVir = sc.nextDouble();
		
		int num = (int) numVir;
		
		System.out.println("O número sem vírgula fica: " +  num);
		
		sc.close();
	}
}
