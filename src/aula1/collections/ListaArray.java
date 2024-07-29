package aula1.collections;

import java.util.ArrayList;
import java.util.List;

public class ListaArray {

	public static void main(String[] args) {
		new ListaArray();

	}

	public ListaArray() {
		List<String> lista = new ArrayList<String>();

		lista.add("Elemento 1");
		lista.add("Elemento 2");

		// Mostra o tamanho da lista
		System.out.println("Tamanho: " + lista.size());

		// Pega o Primeiro elemento da lista
		System.out.println(lista.get(0));
		lista.remove("Elemento 2");
		System.out.println("Tamanho: " + lista.size());

	}

}
