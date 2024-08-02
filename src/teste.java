
public class teste {
	private double saldo;
	
	 public void sacar(double valor) {
	        if (valor > saldo) {
	            // Em vez de IllegalStateException, podemos retornar false para indicar falha
	         
	        }
	        saldo -= valor;
	    }
	
}
