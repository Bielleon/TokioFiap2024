package aula05;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Coloque quantos dias voce viveu e iremos informar em anos, meses e dias");
		System.out.println("=======================================================");
		System.out.println("digite quantos dias voce viveu");
		int vida = sc.nextInt();

		int ano = vida / 365;

		int meses = (vida % 365) / 30;
		
		int dias = vida % 365 % 30;

		System.out.println("Anos que voce viveu: " + ano);
		System.out.println("Meses que voce viveu: " + meses);
		System.out.println("Dias que voce viveu: " + dias);

		sc.close();
	}

}