package aula07;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um valor: ");
		int valor = sc.nextInt();

		System.out.println("Números pares entre 2 e " + valor + ":");
		for (int i = 2; i <= valor; i += 2) {
			System.out.println(i);
		}

		sc.close();

	}

}
