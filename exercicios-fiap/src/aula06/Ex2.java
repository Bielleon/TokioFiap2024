package aula06;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor inteiro: ");
		int num1 = sc.nextInt();

		System.out.println("Digite o segundo valor inteiro: ");
		int num2 = sc.nextInt();

		if (num1 > num2) {
			System.out.println(num1);
		} else if (num2 > num1) {
			System.out.println(num2);
		} else if (num1 == num2) {
			System.out.println("Os numeros sao iguais!");
		}

		sc.close();
	}
}
