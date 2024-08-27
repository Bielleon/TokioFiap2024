package aula05;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite seu nome completo:");
		String nome = sc.nextLine();

		System.out.println("Digite seu CPF:");
		int cpf = sc.nextInt();

		System.out.println("Digite seu numero de telefone:");
		int telefone = sc.nextInt();

		System.out.println("Seu nome: " + nome);
		System.out.println("Seu cpf: " + cpf);
		System.out.println("Seu telefone: " + telefone);

		sc.close();
	}

}
