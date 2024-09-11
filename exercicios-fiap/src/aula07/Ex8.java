package aula07;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;

		do {
			System.out.print("Digite um número inteiro positivo: ");
			numero = sc.nextInt();
			if (numero <= 0) {
				System.out.println("Erro, o número deve ser positivo.");
			}
		} while (numero <= 0);

		int soma = 0;
		for (int i = 0; i <= numero; i++) {
			soma += i;
		}

		System.out.println("A soma de 1 até " + numero + " é: " + soma);

		sc.close();

	}

}
