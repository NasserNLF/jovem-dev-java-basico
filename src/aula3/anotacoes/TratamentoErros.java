package aula3.anotacoes;

import javax.swing.JOptionPane;

public class TratamentoErros {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		//Pega a primeria
		try {
			String s = null;
			s.equals("abc");
			System.out.println("Sucesso");
		} catch (NullPointerException e) {
			System.out.println("Erro de variável nula");
		}catch (IllegalArgumentException e) {
			System.out.println("Outra mensagem de erro");
		}
		System.out.println("Continuando o programa!");
		
		//Faz uma verificação única
		try {
			String s = null;
			s.equals("abc");
			System.out.println("Sucesso");
		} catch (NullPointerException  | IllegalArgumentException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			//Mostra no console o erro
			e.printStackTrace();
		}
		System.out.println("Continuando o programa!");
		
		//Interface RuntTime
		try {
			String s = null;
			s.equals("abc");
			System.out.println("Sucesso");
		} catch (RuntimeException e) {
			JOptionPane.showMessageDialog(null, e);
			e.printStackTrace();
		}

		try {
			String s = null;
			s.equals("abc");
			System.out.println("Sucesso");
		} catch (RuntimeException e) {
			JOptionPane.showMessageDialog(null, e);
			e.printStackTrace();
		}finally {
			System.out.println("Processo finalizado");
		}
		System.out.println("Continundo o programa");
		
		
		
	}
}
