import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero inteiro");
		int v1 = sc.nextInt();

		System.out.println("Digite outro numero inteiro");
		int v2 = sc.nextInt();

		v1 = v1 * v2;

		v2 = v1 / v2;

		v1 = v1 / v2;

		System.out.println(v1);
		System.out.println(v2);

		sc.close();

	}
}
