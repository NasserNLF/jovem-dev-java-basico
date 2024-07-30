package aula2.poo.exercicio8;

public class Principal {
	public static void main(String[] args) {
		new Principal();
	}
	
	public Principal() {
		Automovel carro = new Automovel();
		
		carro.setNome("Sandero");
		carro.setCor("Prata");
		carro.setVelocidade(100.0);
		
		System.out.println(carro.toString());
		carro.acelerar();
	}
}
