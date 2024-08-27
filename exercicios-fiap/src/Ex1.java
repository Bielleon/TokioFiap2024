import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Qual o ano de seu nascimento?");
		short ano = sc.nextShort();

		int anoAtual = 2023;

		anoAtual = anoAtual - ano;

		System.out.println("Sua idade é:" + anoAtual);

		sc.close();

	}

}
