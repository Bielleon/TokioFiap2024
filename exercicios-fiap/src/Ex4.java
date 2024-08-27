import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor inteiro");
		double v1 = sc.nextDouble();

		System.out.println("numero digitado:" + v1);
		System.out.println("numero sucessor:" + ++v1);
		--v1;
		System.out.println("numero antecessor:" + --v1);
		System.out.println("numero dobrado:" + ++v1 * 2);
		System.out.println("numero cortado:" + v1 / 2);

		sc.close();
	}
}
