package aula6.anotacoes;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class Exemplos {

	// Declaração de constante - Nome convenção
	private static final Double VALOR_PI = 3.14;

	public static void main(String[] args) {
		System.out.println(VALOR_PI);
		// Constante na classe Math
		System.out.println(Math.PI);

		// Acessando um elemento em um Enum
		System.out.println(FormaPagamentoEnum.DINHEIRO);

		// Percorrendo os elementos de um Enum
		for (FormaPagamentoEnum f : FormaPagamentoEnum.values()) {
			System.out.println(f);
		}

		// Usando um switch
		FormaPagamentoEnum f = FormaPagamentoEnum.DINHEIRO;

		switch (f) {
		case CARTAO_CREDITO:
			// Faz uma operação
			break;
		case CARTAO_DEBITO:
			// Faz uma operação
			break;
		case DINHEIRO:
			// Faz uma operação
			break;
		default:
			// Faz outra operação
			break;

		}

		if (FormaPagamentoEnum.DINHEIRO.equals(f)) {
			System.out.println("Fazendo operação com o enum dinheiro");
			System.out.println(f.getDesconto().get());
		}
		
		//Usando StringBuilder
		StringBuilder sb = new StringBuilder();
		sb.append("Bom dia ");
		sb.append("Boa tarde ");
		sb.append("Boa noite ");
		
		System.out.println(sb);
		
		//BigDecimal
		BigDecimal numero1 = BigDecimal.valueOf(0.1);
		BigDecimal numero2 = BigDecimal.valueOf(0.2);
		System.out.println(numero1.add(numero2));
		
		System.out.println(Math.pow(100, 200));
		System.out.println(BigDecimal.valueOf(100).pow(200));
		
		BigDecimal b1 = BigDecimal.valueOf(2);
		BigDecimal b2 = BigDecimal.valueOf(3);
		
		System.out.println(b1.divide(b2, 5, RoundingMode.HALF_EVEN));
		
		//Objecs
		String a = null;
		String b = "abc";
		
		System.out.println(Objects.equals(a, b));


	}

}
