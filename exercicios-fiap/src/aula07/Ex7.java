package aula07;

import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe a média da turma(0-10): ");
		double media = sc.nextDouble();
		int acimaDaMedia = 0;
		int abaixoDaMedia = 0;

		for (int i = 1; i <= 20; i++) {
			double nota;

			do {
				System.out.print("Digite a nota do aluno " + i + " (de 0 a 10): ");
				nota = sc.nextDouble();

				if (nota < 0 || nota > 10) {
					System.out.println("A nota do aluno deverá ser de 0 a 10, digite novamente");
				}

			} while (nota < 0 || nota > 10);

			if (nota >= media) {
				acimaDaMedia++;
			} else if (nota < media) {
				abaixoDaMedia++;
			}
		}

		sc.close();

		System.out.println("Alunos com nota acima da média: " + acimaDaMedia);
		System.out.println("Alunos com nota abaixo da média: " + abaixoDaMedia);
	}
}
