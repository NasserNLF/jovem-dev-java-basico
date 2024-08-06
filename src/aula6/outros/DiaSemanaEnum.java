package aula6.outros;

public enum DiaSemanaEnum {
	DOMINGO("Domingo"){
		@Override
		String isFimDeSemana() {
			return "Cai em um dia de semana";
		}
	},
	SEGUNDA_FEIRA("Segunda-Feira"){
		@Override
		String isFimDeSemana() {
			return "Não cai em um fim de semana";
		}
	},
	TERCA_FEIRA("Terça-Feira"){
		@Override
		String isFimDeSemana() {
			return "Não cai em um fim de semana";
		}
	},
	QUARTA_FEIRA("Quarta-Feira"){
		@Override
		String isFimDeSemana() {
			return "Não cai em um fim de semana";
		}
	},
	QUINTA_FEIRA("Quinta-Feira"){
		@Override
		String isFimDeSemana() {
			return "Não cai em um fim de semana";
		}
	},
	SEXTA_FEIRA("Sexta-Feira"){
		@Override
		String isFimDeSemana() {
			return "Não cai em um fim de semana";
		}
	},
	SABADO("Sabádo"){
		@Override
		String isFimDeSemana() {
			return "Cai em um fim de semana";
		}
	};
	
	//Atributo
	private String nome;
	
	//Preferi usar um String do que um boolean para imprimir uma mensagem personalizada
	abstract String isFimDeSemana();

	//Construtor
	private DiaSemanaEnum(String nome) {
		this.nome = nome;
	}
	
	//Getters
	public String getNome() {
		return nome;
	}
	
	@Override
	public String toString() {
		return nome + " - " + isFimDeSemana();
	}
	
}
