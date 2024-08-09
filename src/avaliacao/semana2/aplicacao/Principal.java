package avaliacao.semana2.aplicacao;

import java.util.ArrayList;
import java.util.List;

import avaliacao.semana2.entidades.Arok;
import avaliacao.semana2.entidades.Barbaro;
import avaliacao.semana2.entidades.Mago;
import avaliacao.semana2.entidades.Morcego;
import avaliacao.semana2.entidades.Paladino;
import avaliacao.semana2.entidades.Personagem;
import avaliacao.semana2.entidades.Urso;
import avaliacao.semana2.entidades.Vampiro;
import avaliacao.semana2.entidades.Zumbi;

public class Principal {
	public static void main(String[] args) {
		new Principal();
	}

	public Principal() {
		// Lista de Heróis
		List<Personagem> herois = new ArrayList<>();
		herois.add(new Mago("Mago", 30, 18, 23));
		herois.add(new Barbaro("Bárbaro", 100,  20, 18));
		herois.add(new Paladino("Paladino", 50, 20, 19));

		// Lista de inimigos
		List<Personagem> inimigos = new ArrayList<>();
		inimigos.add(new Morcego("Morcego", 10, 5, 5));
		inimigos.add(new Zumbi("Zumbi", 22,  6, 6));
		inimigos.add(new Urso("Urso", 30, 8, 9));
		inimigos.add(new Vampiro("Vampiro", 35, 10, 10));
		inimigos.add(new Arok("Arok, Mestre Supremo", 50, 20, 20));

		// Simulações de batalhas
		for (Personagem heroi : herois) {
			int cont = 0;
			Boolean situacaoParaContinuar = null;
			do {
				situacaoParaContinuar = heroi.batalha(inimigos.get(cont));
				cont++;
			} while (situacaoParaContinuar && cont < inimigos.size());

			if (situacaoParaContinuar) {
				System.out.println(
						heroi.getNome() + " venceu Arok, Mestre Supremo! " + heroi.getNome() + " é o Novo Campeão!");
			} else {
				System.out.println(heroi.getNome() + " perdeu para " + inimigos.get(cont - 1).getNome()
						+ "! Fica para uma próxima vez a chance de ser campeão!");
			}
			
			//Apenas para ficar melhor de ver no console
			System.out.println("*****************************************\n\n\n");

			// Resetando vida dos inimigos para as batçhas contra os próximos heróis
			resetaVidaDosHerois(inimigos);
		}
	}

	public void resetaVidaDosHerois(List<Personagem> inimigos) {
		for (Personagem inimigo : inimigos) {
			inimigo.setHp(inimigo.getMaxHp());
		}
	}
}
