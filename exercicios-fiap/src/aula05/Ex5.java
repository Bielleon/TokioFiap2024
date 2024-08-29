package aula05;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a primeira nota do aluno de 1 a 10:");
		double nota1 = sc.nextDouble();

		System.out.println("Digite a segunta nota do aluno de 1 a 10");
		double nota2 = sc.nextDouble();

		double media = ((nota1 * 0.4) + (nota2 *0.6));

		if (media >= 6) {
			System.out.println("Sua media ponderada é: " + media + "! " + " Voce foi Aprovado!!");
		} else {
			System.out.println("Sua media ponderada é: " + media + "! " + " Voce foi Reprovado kkj");
		}

		sc.close();

	}

}
