package aula07;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero:");
		int n = sc.nextInt();

		int mutiplicacao;

		for (int i = 0; i <= 25; i++) {

			mutiplicacao = n * i;
			System.out.println(n + "x" + i + ": " + mutiplicacao);

		}

		sc.close();
	}

}

/*
 * System.out.println("Digite um numero:"); int n = sc.nextInt();
 * 
 * System.out.println(n + "x 1 = " + (n*1)); System.out.println(n + "x 2 = " +
 * (n*2)); System.out.println(n + "x 3 = " + (n*3)); System.out.println(n +
 * "x 4 = " + (n*4)); System.out.println(n + "x 53 = " + (n*5));
 */
