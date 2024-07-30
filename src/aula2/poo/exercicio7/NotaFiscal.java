package aula2.poo.exercicio7;

public class NotaFiscal {
	
	
	private String emitente;
	private Double valor;
	
	public String getEmitente() {
		return emitente;
	}

	public void setEmitente(String emitente) {
		this.emitente = emitente;
	}

	public Double getValor() {
		return valor;
	}
	
	//Método para definir o valor
	public void calculaValor(double valorProduto, double porcentagem) {
		valor = valorProduto - (valorProduto * porcentagem/100);
	}
	
}
