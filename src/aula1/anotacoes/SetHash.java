package aula1.anotacoes;

import java.util.HashSet;
import java.util.Set;

public class SetHash {
	public static void main(String[] args) {
		new SetHash();
	}
	
	public SetHash() {
		Set<String> conjunto = new HashSet<String>();
		
		//Não adiciona repeticões
		conjunto.add("Elemento 1");
		conjunto.add("Elemento 1");
		conjunto.add("Elemento 2");
		conjunto.add("Elemento 2");
		System.out.println("Tamanho: " + conjunto.size());
		conjunto.remove("Elemento 1");
		conjunto.remove("Elemento 2");
		System.out.println(conjunto.isEmpty());
		
	}
}
