import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a distancia do inimigo");
		int d = sc.nextInt();

		if (d > 70) {
			System.out.println("DESATIVADO");
		} else {
			System.out.println("ATIVADO");
		}

		sc.close();
	}

}
