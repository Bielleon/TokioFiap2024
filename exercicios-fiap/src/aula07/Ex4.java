package aula07;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double valor = 0;
		double soma = 0;

		System.out.println("Digite 10 valores para que eles sejam somados: ");

		for (int i = 1; i <= 10; i++) {
			valor = Integer.parseInt(sc.nextLine());
			soma += valor;
		}

		System.out.println("Total = " + soma);

	}

}