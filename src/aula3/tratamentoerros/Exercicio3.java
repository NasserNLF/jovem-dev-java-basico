package aula3.tratamentoerros;

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
		
		//Analisar depois
		
//		//IllegalStateException
//		try {
//			throw new IllegalStateException();
//			
//		} catch (IllegalStateException e) {
//			e.printStackTrace();
//		}

	}

}
