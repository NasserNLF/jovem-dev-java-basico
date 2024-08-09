package avaliacao.semana2.entidades;

import java.util.Random;

import avaliacao.semana2.exceptions.PersonagemDerrotadoException;

public abstract class Personagem {

	// Atributos
	private String nome;
	private Integer maxHp;
	private Integer hp;
	private Integer ataque;
	private Integer defesa;

	public Personagem(String nome, Integer maxHp, Integer ataque, Integer defesa) {

		this.nome = nome;
		this.maxHp = maxHp;
		this.hp = maxHp;
		this.ataque = ataque;
		this.defesa = defesa;
	}

	// Dado
	Random dado = new Random();

	public Boolean batalha(Personagem inimigo) {
		System.out.println("*****************************************\nBATALHA: " + this.getNome() + " X "
				+ inimigo.getNome() + "\n");
		do {
			// Ataque do herói
			try {
				ataque(this, inimigo);
			} catch (PersonagemDerrotadoException e) {
				System.out.println(e.getMessage());
			}

			if (inimigo.getHp() > 0 ) {
				// Ataque do inimigo
				try {
					ataque(inimigo, this);
				} catch (PersonagemDerrotadoException e) {
					System.out.println(e.getMessage());
				}
			}

		} while (this.getHp() > 0 && inimigo.getHp() > 0);

		if (this.getHp() > 0) {
			// Restaurando a vida para a próxima batalha
			this.setHp(this.maxHp);
			return true;
		}
		System.out.println("GAME OVER PARA " + this.getNome());
		return false;

	}

	public Boolean ataque(Personagem atacante, Personagem defensor) throws PersonagemDerrotadoException {
		
		try {
			System.out.println("*****************************************\nVez de atacar de " + atacante.getNome() + "\n\n");
			System.out.println("Calculando dano....");
			//Só para um suspense mesmo
			Thread.sleep(4000);
			Integer boostDano = dado.nextInt(7);
			
			System.out.println("O boost de dano do ataque é de " + boostDano + "\nAtaque Total: " + (atacante.getAtaque() + boostDano));

			// Verificação do dano do ataque no defensor
			if ((atacante.getAtaque() + boostDano) > defensor.getDefesa()) {
				
				System.out.println("Ataque Sucedido!");
				System.out.println("Dano realizado no adversário: " + ((atacante.getAtaque() + boostDano) - defensor.getDefesa()));
				
				//Descontando o dano realizado na vida no defensor
				defensor.setHp(defensor.getHp() - ((atacante.getAtaque() + boostDano) - defensor.getDefesa()));
				
				//Em caso de fim de batalha
				if (defensor.getHp() <= 0) {
					System.out.println("HP de " + defensor.getNome() + ": 0/" + defensor.getMaxHp());
					throw new PersonagemDerrotadoException(defensor.getNome() + " foi derrotado por " + atacante.getNome());
				}
			} else {
				System.out.println("Ataque falhou!");
			}
			System.out.println("HP de " + defensor.getNome() + ": " + defensor.getHp() + "/" + defensor.getMaxHp());
			
			//Novamente um suspense
			Thread.sleep(4000);
			
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}

		
		// Ainda há condições de batalha
		return true;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setMaxHp(Integer maxHp) {
		this.maxHp = maxHp;
	}

	public void setHp(Integer hp) {
		this.hp = hp;
	}

	public void setAtaque(Integer ataque) {
		this.ataque = ataque;
	}

	public void setDefesa(Integer defesa) {
		this.defesa = defesa;
	}

	public void setDado(Random dado) {
		this.dado = dado;
	}

	public String getNome() {
		return nome;
	}

	public Integer getMaxHp() {
		return maxHp;
	}

	public Integer getHp() {
		return hp;
	}

	public Integer getAtaque() {
		return ataque;
	}

	public Integer getDefesa() {
		return defesa;
	}

	public Random getDado() {
		return dado;
	}

}
