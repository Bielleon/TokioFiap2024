package aula05;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor inteiro de 1 a 999:");
		int v1 = sc.nextInt();

		int unidade = ((v1 % 100) % 10);
		int dezena = ((v1 % 100) - unidade);
		int centena = ((v1 - dezena) - unidade);

		System.out.println("Centena: " + centena);
		System.out.println("Dezena: " + dezena);
		System.out.println("Unidade: " + unidade);

		sc.close();
	}

}
