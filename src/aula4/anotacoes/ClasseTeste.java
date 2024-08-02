package aula4.anotacoes;

import java.util.function.Predicate;

public class ClasseTeste {
	public static Double retornaValor(Double a, Double b, Predicate<Double> criterio) {
		Double soma = 0.0;
		if (criterio.test(a)) {
			soma = a + b;
		}
		return soma;
	}
}
