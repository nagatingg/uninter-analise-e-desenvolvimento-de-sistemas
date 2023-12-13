package cofrinho;

import java.util.ArrayList;

public class Cofrinho {
	private ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();
	
	
	// Adicionando Moedas do cofrinho do usuário
	public void adicionar(Moeda moeda) {
		listaMoedas.add(moeda);
	}
	
	
	//Removendo moedas do cofrinho do usuário
	public void remover(double valor) {
		for (Moeda moeda:listaMoedas) {
			if (moeda.getValor() == valor) {
				listaMoedas.remove(moeda);
				return;
			}
		}
		System.out.println("Você não tem moedas no cofrinho.");
		
		
		// Lista das moedas do cofrinho do usuário
	} public void listagemMoedas() {
		for(Moeda m:listaMoedas) {
			System.out.println(m);
		}
	}
	
	
	// Somando moedas do cofrinho do usuário
	public double totalMoedas() {
		double total = 0;
		for (Moeda m:listaMoedas) {
			total += m.converter();
		}
		System.out.println("Voce tem no total: " + total);
		return total;
	}

}
