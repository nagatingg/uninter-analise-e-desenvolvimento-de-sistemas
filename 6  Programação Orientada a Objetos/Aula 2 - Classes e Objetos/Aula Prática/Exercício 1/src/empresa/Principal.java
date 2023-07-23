package empresa;

public class Principal {

	public static void main(String[] args) {
		Avaliacao luigi = new Avaliacao();
		luigi.n1 = 8;
		luigi.n2 = 3;
		
		Avaliacao mario = new Avaliacao(7,4, 10);
		
		System.out.println("Média Aritmetica do Mario: " + mario.mediaAritmetica());
		System.out.println("Média Ponderada do Mario: " + mario.mediaPonderada());

		System.out.println("Média Aritmetica do Luigi: " + luigi.mediaAritmetica());
		System.out.println("Média Ponderada do Luigi: " + luigi.mediaPonderada());

	}

}
