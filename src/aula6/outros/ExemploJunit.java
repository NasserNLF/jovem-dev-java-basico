package aula6.outros;

public class ExemploJunit {
	
	private int numero;
	
	public ExemploJunit(int numero) {
		this.numero = numero;
	}
	
	
	public String verificaNumero(int i) {
		if (numero != 50) {
			throw new RuntimeException("Erro no número de segurança");
		}
		if (i == 0) {
			return "ZERO";
		}
		throw new IllegalArgumentException("Deve ser zero");
	}
	

}
