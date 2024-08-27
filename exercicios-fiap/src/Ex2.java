import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("informe a duracao do filme em minutos: ");
		short duracao = sc.nextShort();

		double minutos = duracao % 60;
		double horas = (duracao - minutos) / 60;

		System.out.println("o filme tem " + horas + " horas e " + minutos + " minutos");

		sc.close();
	}

}