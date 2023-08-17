// Atividade: Programação Orientada a Objetos Atividade Prática
// Prof. Leonardo Gomes, Dr.
// Aluno: Wesley Alexandre Rodrigues Martins RU: 4362522

package cofrinho;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Método padrão
		
		Scanner ler = new Scanner(System.in);
		Cofrinho cofrinho = new Cofrinho();
		// Tela inicial do usuário
		while(true) {
			System.out.println("Cofrinho de moedas do Aluno: Wesley Alexandre Rodrigues Martins RU: 4362522");
			System.out.println("1 - Adicionar moedas de diferentes valores e paises em seu cofrinho");
			System.out.println("2 - Remover moedas especificas do cofrinho");
			System.out.println("3 - Listar as moedas que estao dentro do cofrinho");
			System.out.println("4 - Calcular quanto dinheiro existe no cofrinho convertido para Real");
			System.out.println("5 - Fechar o programa");
			System.out.println("Qual e a sua opcao: ");
			
			// Verificando a escolha do usuário
			int escolha;
			
			
			// Teste de requisito do valor digitado pelo usuário, para validar as opções
			do { while (!ler.hasNextInt()) {
				System.out.println("A opcao escolhida nao existe.");
				System.out.println("Escolha novamente: ");
				ler.next();
				
				
			} escolha = ler.nextInt();
			if (escolha <= 0 || escolha > 5) {
				System.out.println("A opcao escolhida nao existe.");
				System.out.println("Escolha novamente: ");
			}
			
		}
			while (escolha <= 0 || escolha > 5);
			switch (escolha) {
			case 1:

				System.out.println("Opcao 1 selecionada: Adicionar moedas de diferentes valores e paises em seu cofrinho");
				int opcaoMoeda;
				do {

					System.out.println("Qual a opcao da moeda: ");
					System.out.println("1 - R$ Real");
					System.out.println("2 - U$ Dolar");
					System.out.println("3 - € EURO");
					// Verificando o valor digitado pelo usuário
					while (!ler.hasNextInt()) {
						System.out.println("Operacao invalida. Escolha a opcao da moeda: ");
						System.out.println("1 - U$ Dolar");
						System.out.println("2 - € EUROU");
						System.out.println("3 - R$ Real");
						ler.next();
					}
					opcaoMoeda = ler.nextInt();
					
					
				} while (opcaoMoeda <= 0 || opcaoMoeda > 3);
				
				
				if (opcaoMoeda == 1) {
					// Adicionando ao cofrinho em dolar
					System.out.println("Qual valor em DOLAR deseja adicionar? ");
					double valor = ler.nextDouble();
					Dolar dolar = new Dolar (valor);
					cofrinho.adicionar(dolar);
					break;
					
					
				} else if (opcaoMoeda == 2) {
					// Adicionando ao cofrinho em euro
					System.out.println("Qual valor em EURO deseja adicionar? ");
					double valor = ler.nextDouble();
					Euro euro = new Euro (valor);
					cofrinho.adicionar(euro);
					break;
				
					
				} else if (opcaoMoeda == 3) {
					// Adicionando ao cofrinho em real
					System.out.println("Qual valor em REAL deseja adicionar? ");
					double valor = ler.nextDouble();
					Real real = new Real (valor);
					cofrinho.adicionar(real);
					break;
					
				
				} else {
					System.out.println("Operacao invalida.");
					break;
				}
				
				
				case 2:
					System.out.println("Deseja remover qual moeda?");
					System.out.println("1 - U$ Dolar");
					System.out.println("2 - € EURO");
					System.out.println("3 - R$ Real");
					escolha = ler.nextInt();
					
					
					// Verificando as opções de remover moeda
					if (escolha == 1) {
						System.out.println("Qual o valor da moeda deseja remover? ");
						double valor = ler.nextDouble();
						cofrinho.remover(valor);
						break;
						
						
					} else if (escolha == 2) {
						System.out.println("Qual o valor da moeda deseja remover? ");
						double valor = ler.nextDouble();
						cofrinho.remover(valor);
						break;
						
						
					} else if (escolha == 3) {
						System.out.println("Qual o valor da moeda deseja remover? ");
						double valor = ler.nextDouble();
						cofrinho.remover(valor);
						break;
						
						
					} else {
						System.out.println("Operacao invalida.");
						break;
						
						
					}
					
					
					// Mostrando todas as moedas do cofrinho
				case 3:
					System.out.println("Listas todas as moedas");
					cofrinho.listagemMoedas();
					break;
					
					// Somando as moedas
				case 4:
					cofrinho.totalMoedas();
					break;
					
					// Fechando o programa para o usuário
				case 5:
					System.out.println("Fechando o programa.");
					ler.close();
					return;
					
					// Erro de escolha do usuário
				default:
						System.out.println("Operacao invalida.");
						System.out.println("Digite novamente: ");
			}
		}
	}

}
