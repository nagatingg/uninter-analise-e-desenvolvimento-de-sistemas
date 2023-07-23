package empresa;

public class Principal {

	public static void main(String[] args) {
		Conta c1 = new Conta(111, "Mario", 2000, 500);
		
		c1.info();
		
		if(!c1.sacar(200)) {
			System.out.println("Problema ao sacar!");
		}
		
		c1.sacar(200);
		c1.depositar(500);
		c1.info();

	}

}
