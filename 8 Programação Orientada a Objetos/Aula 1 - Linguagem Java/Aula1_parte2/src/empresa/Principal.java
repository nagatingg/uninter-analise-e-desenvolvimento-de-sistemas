package empresa;

import java.util.Scanner;

public class Principal {
// Array
	public static void main(String[] args) {
		
		int idade = 10;
		String nome = "Wesley";
		idade = idade + 2;
		double peso = 80.5;
		
		Scanner teclado = new Scanner(System.in);
		
		idade = teclado.nextInt();
		peso = teclado.nextDouble();
		nome = teclado.next();
		
		System.out.println("Idade: " + idade);
		System.out.printf("Peso: %.2f\n", peso);
		System.out.printf("Idade: %d\n", idade);
		
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		System.out.println("Bye World");
		
		if(idade <18) {
			System.out.println("Acesso bloqueado");
		} else if(idade <65) {
			System.out.println("Adulto");
		}
		else {
			System.out.println("Adulto idoso";)
		}
		while () {
			
		}
		for(int i=0; i < 10; i++) {
			System.out.println("Valor: " + i);
		}
		
		//array = lista
		//ArrayList
		
		int megaSena[] = {11, 14, 21, 30, 37, 44, 56};
		int numeros[] = new int[200];]
				
		numeros[60] = 50;
		megaSena[0] = 12;

	}

}
