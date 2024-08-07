package aula5.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import aula5.stream.exceptions.ZeroBertoException;

public class Exercicio5 {
	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();

		lista.add("Nasser");
		lista.add("Hum");
		lista.add("Ana");
		lista.add("Vitória");
		lista.add("Lucas");
		lista.add("Nicolas");
		lista.add("Felix");
		lista.add("Gabriel");
		lista.add("Leticia");
		lista.add("João");

		
//		System.out.println(lista.stream().filter(s-> s.endsWith("berto")).findFirst().orElseThrow(() -> new ZeroBertoException("Não há nenhum nome terminado em berto")));
		System.out.println(retornaBerto(lista));
		
	}
	
	public static String retornaBerto(List<String> lista) {
		List<String> listaAux = lista.stream().filter(s-> s.endsWith("berto")).collect(Collectors.toList());
		
		if (!listaAux.isEmpty()){
			return "Berto encontrado! " + listaAux.get(0);
		}
		throw new ZeroBertoException("Erro! Não há nenhum berto na lista");
	}
}
