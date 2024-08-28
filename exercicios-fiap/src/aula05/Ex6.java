package aula05;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome da peça:");
		String peca1 = sc.nextLine();

		System.out.println("Digite quantas peças você deseja:");
		int qt1 = sc.nextInt();

		int valorPeca1 = 10;

		valorPeca1 = valorPeca1 * qt1;

		System.out.println("Digite o nome da segunda peça:");
		String peca2 = sc.nextLine();

		System.out.println("Digite quantas peças você deseja:");
		int qt2 = sc.nextInt();

		int valorPeca2 = 10;

		valorPeca2 = valorPeca2 * qt2;

		double valorPago = valorPeca2 + valorPeca1;

		System.out.println("O valor final das peças " + peca1 + " e " + peca2 + " ficou em: " + valorPago);
		System.out.println("Lembrando que o valor de todas as peças são 10 rael");

		sc.close();
	}
}
