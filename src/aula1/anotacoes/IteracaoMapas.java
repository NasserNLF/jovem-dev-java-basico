package aula1.anotacoes;

import java.util.HashMap;
import java.util.Map;

public class IteracaoMapas {
	public static void main(String[] args) {
		Map<Integer, String> mapa = new HashMap<>();

		mapa.put(1, "João1");
		mapa.put(2, "João2");
		mapa.put(3, "João3");
		mapa.put(4, "João4");
		mapa.put(5, "João5");
		mapa.put(6, "João6");
		
		//Iterando o mapa
		for(Map.Entry<Integer, String> elemento : mapa.entrySet()) {
			System.out.println(elemento.getKey() + "-" + elemento.getValue());
		}
		
		
		
		
	}
	
}
