package aula7.testes;

import java.util.List;

public class OperacaoListas {
	
	Integer somaNumeros(List<Integer> lista) {
		return lista.stream().mapToInt(Integer::intValue).sum();
	}
	
	Double retornaMediaMaioresCinquenta(List<Integer> lista) {
		return lista.stream().filter(i -> i > 50).mapToInt(Integer::intValue).average().orElse(0.0);
	}
	
	int conta25(List<Integer> lista) {
		return (int) lista.stream().filter(i -> i == 25).count();
	}
	
}
