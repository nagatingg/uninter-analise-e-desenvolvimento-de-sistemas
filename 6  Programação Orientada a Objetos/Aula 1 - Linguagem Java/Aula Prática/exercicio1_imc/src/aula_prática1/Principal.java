
 package aula_prática1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int peso;
		double altura;
		
		System.out.println("Digite seu peso e posteriormente sua altura: ");
		Scanner teclado = new Scanner(System.in);
		peso = teclado.nextInt();
		altura = teclado.nextDouble();
		
		double imc = peso / (altura * altura);
		System.out.printf("Seu IMC é: %.2f", imc);

	}

}