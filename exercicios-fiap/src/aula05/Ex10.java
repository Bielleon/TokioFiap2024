package aula05;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Esse programa vai ler sua idade em anos, meses e dias!\nDepois vamos saber quantos dias voce viveu!");
		System.out.println("=======================================================");
		System.out.println("digite sua idade com anos:");
		int ano = sc.nextInt();

		System.out.println("digite sua idade com meses:");
		int meses = sc.nextInt();

		System.out.println("digite sua idade com dias:");
		int dias = sc.nextInt();

		ano = ano * 365;

		meses = meses * 30;

		System.out.println("Dias que voce viveu: " + (ano + meses + dias));

		sc.close();
	}

}
