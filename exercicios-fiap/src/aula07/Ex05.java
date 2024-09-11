package aula07;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o 1º valor: ");
		double numMaior = sc.nextDouble();

		for (int i = 2; i <= 12; i++) {
			System.out.print("Digite o " + i + "º valor: ");
			double numero = sc.nextDouble();

			if (numero > numMaior) {
				numMaior = numero;
			}
		}

		System.out.println("O maior número digitado foi: " + numMaior);

		sc.close();
	}
}