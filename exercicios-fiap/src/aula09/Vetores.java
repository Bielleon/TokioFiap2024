package aula09;

import java.util.Iterator;

public class Vetores {

	public static void main(String[] args) {
		
		int[] vetorinteiro = new int[10];
		
		vetorinteiro[0] = 10;
		vetorinteiro[1] = 99;
		
		System.out.println("Valor inteiro posicao 0: " + vetorinteiro[0]);
		
		int anoNascimento = vetorinteiro[1];
		System.out.println("ano Nascimento: " + anoNascimento);
		
		int posicao = 1;
		System.out.println(vetorinteiro[posicao]);
		
		//==============================================================
		
		String[] listaFrutas = new String[4];
		
		listaFrutas [0] = "morango";
		listaFrutas [1] = "uva";
		listaFrutas [2] = "pera";
		listaFrutas [3] = "tomate";

		System.out.println();
		System.out.println("fruta posicao 1: " + listaFrutas[0]);
		
		String[] listaFrutas2 = {"melacia", "abacaxi", "pitaia", "banana"};
		
		int qtdFrutas = listaFrutas2.length;
		System.out.println("Qtd de frutas: " + qtdFrutas);
		
		for (int i = 0; i < qtdFrutas; i++) {
			
			System.out.println(listaFrutas2[i]);
			
			//==================================================================
			
			int[] numeros = {16, 24, 29, 33};
			
			for (int numero: numeros) {
				
			}
			
			
		}
		
	}

}
