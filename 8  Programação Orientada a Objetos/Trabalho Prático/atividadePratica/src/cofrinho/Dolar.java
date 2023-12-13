package cofrinho;

public class Dolar extends Moeda {
	public Dolar (double valor) {
		super(valor);
	}
	
	
	public double converter () {
		// Valor do dolar no dia 10/07/2023
		return valor * 4.78;
	}
	
	
	public void info () {
		System.out.println("Converter de dolar para real: " + this.converter());
	}
	
	
	public String toString() {
		return "Voce tem no total de Dolar para converter" + converter();
	}
}
