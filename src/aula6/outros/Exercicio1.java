package aula6.outros;

public class Exercicio1 {
	public static void main(String[] args) {
		//Loop para percorrer os valores do Enum
		for(DiaSemanaEnum d : DiaSemanaEnum.values()) {
			System.out.println(d);
		}
	}
}
