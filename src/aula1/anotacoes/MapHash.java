package aula1.anotacoes;

import java.util.HashMap;
import java.util.Map;

public class MapHash {
	public static void main(String[] args) {
		new MapHash();
	}

	public MapHash() {
		// Uma chave retorna o valor
		Map<Integer, String> mapa = new HashMap<Integer, String>();

		// Inserindo chaves e valores
		mapa.put(1, "João");
		mapa.put(2, "Maria");

		System.out.println(mapa.get(1));

		System.out.println(mapa.size());

		// Sobreescrevendo os valores
		mapa.put(1, "José");

		System.out.println(mapa.get(1));

		mapa.remove(1);

		System.out.println(mapa.get(1));

		mapa.put(1, "José");

		// Remove se os dois forem verdadeiros
		mapa.remove(1, "Maria");

		System.out.println(mapa.get(1));

	}
}
