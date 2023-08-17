package cofrinho;

public class Real extends Moeda {
	
	
	public Real (double valor) {
		super(valor);
	}
	
	
	public double converter() {
		return valor;
	}
	
	
	public void info() {
		
		
		// Nao necessario converter
		System.out.println("Nao precisa converter.");
	}
	
	
	public String toString() {
		return "Voce tem o total de Real: " + this.converter();
	}
}
