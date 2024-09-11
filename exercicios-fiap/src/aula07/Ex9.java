package aula07;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;

		do {
			System.out.print("Digite um numero inteiro positivo: ");
			numero = sc.nextInt();
			if (numero <= 0) {
				System.out.println("Erro, o número deve ser positivo.");
			}
		} while (numero <= 0);

		System.out.println("Os divisores de " + numero + " são:");

		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				System.out.println(i);
			}
		}

		sc.close();

	}

}
