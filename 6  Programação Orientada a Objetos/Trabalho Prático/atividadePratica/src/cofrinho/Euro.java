package cofrinho;

public class Euro extends Moeda {
	
	
	public Euro (double valor) {
		super(valor);
	}
	
	
	public double converter() {
		
		
		// Convertendo para o valor do euro no dia 11/07/2023
		return valor * 5.34;
	}
	
	
	public void info() {
		System.out.println("Convertendo o valor de Euro para real: " + this.converter());
	}
	
	
	public String toString() {
		return "Voce tem no total de Euro para converter " + converter();
	}
}
