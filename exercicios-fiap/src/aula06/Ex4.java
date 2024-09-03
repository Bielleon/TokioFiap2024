package aula06;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor inteiro: ");
		int A = sc.nextInt();

		System.out.println("Digite o segundo valor inteiro: ");
		int B = sc.nextInt();

		if ((A % B) == 0 || (B % A) == 0) {
			System.out.println("sao multiplos");
		} else {
			System.out.println("Nao sao multiplos");
		}

		sc.close();
	}

}
