
 package aula_prática1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int palpite;
		int valorCorreto = 10000;
		String msg;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite seu palpite: ");
		palpite = teclado.nextInt();
		
		while(palpite != valorCorreto) {
			msg = palpite > valorCorreto?"Um pouco menos...":"Um pouco mais...";
			System.out.println(msg);
			
		/*	if(palpite > valorCorreto) {
				System.out.println("Um pouco menos...");
			}
			else {
				System.out.println("Um pouco mais...");
			} */
			
			System.out.println("Digite outro palpite: ");
			palpite = teclado.nextInt();
		}
		System.out.println("Parabéns, você acertou!");
	}

}