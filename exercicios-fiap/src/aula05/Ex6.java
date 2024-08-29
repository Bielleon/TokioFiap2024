package aula05;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome da peça:");
		String peca1 = sc.nextLine();

		System.out.println("Digite quantas peças você deseja:");
		String qt1 = sc.nextLine();
		int qts1Int = Integer.parseInt(qt1);

		System.out.println("Digite o valor das peças:");
		String valorPeca1 = sc.nextLine();
		int valor1Int = Integer.parseInt(valorPeca1);

		System.out.println("Digite o nome da segunda peça:");
		String peca2 = sc.nextLine();

		System.out.println("Digite quantas peças você deseja:");
		String qt2 = sc.nextLine();
		int qts2Int = Integer.parseInt(qt2);

		System.out.println("Digite o valor das peças:");
		int valorPeca2 = sc.nextInt();
		
		valor1Int = valor1Int * qts1Int;

		valorPeca2 = valorPeca2 * qts2Int;

		double valorPago = valorPeca2 + valor1Int;

		System.out.println("O valor final das peças " + peca1 + " e " + peca2 + " ficou em: " + valorPago);

		sc.close();
	}
}
