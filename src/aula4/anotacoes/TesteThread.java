package aula4.anotacoes;

public class TesteThread {
	public static void main(String[] args) {
		
		Thread t = new Thread(() ->{
			for(int i = 0; i < 100; i++) {
				System.out.println(i);
			}
		});
		
		System.out.println("Iniciando o programa");
		t.start();
		System.out.println("Fim do programa");
	}
}
