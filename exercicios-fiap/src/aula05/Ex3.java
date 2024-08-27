package aula05;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o seu nome:");
		String nome = sc.nextLine();

		System.out.println("Digite seu genero da seguinte forma:\n [M]\n [F]\n [O]\n [N]");
		char genero = sc.nextLine().charAt(0);

		if (genero == 'M') {
			System.out.println("Olá," + nome + "! " + "Você escolheu o seguinte gênero: " + genero);
		} else if (genero == 'F') {
			System.out.println("Olá," + nome + "! " + "Você escolheu o seguinte gênero: " + genero);
		} else if (genero == 'O') {
			System.out.println("Olá," + nome + "! " + "Você escolheu o seguinte gênero: " + genero);
		} else if (genero == 'N') {
			System.out.println("Olá," + nome + "! " + "Você escolheu o seguinte gênero: " + genero);
		} else {
			System.out.println("Infelizmente seu genero é inexistente e o seu nome irrelevante!");
		}

		sc.close();

	}
}
