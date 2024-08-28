package aula05;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a primeira nota do aluno de 1 a 10:");
		int nota1 = sc.nextInt();

		System.out.println("Digite a segunta nota do aluno de 1 a 10");
		int nota2 = sc.nextInt();

		int media = (nota1 + nota2) / 2;

		if (media >= 6) {
			System.out.println("Sua media é: " + media + "! " + " Voce foi Aprovado!!");
		} else {
			System.out.println("Sua media é: " + media + "! " + " Voce foi Reprovado kkj");
		}

		sc.close();

	}

}
