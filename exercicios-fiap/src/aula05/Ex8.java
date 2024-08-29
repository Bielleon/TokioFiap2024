package aula05;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor em reais para fazer a conversão:");
		float r = sc.nextFloat();

		float d = (r / 5.5309f);
		float e = (r / 6.1537f);
		float p = (r / 0.0058f);
		float l = (r / 7.3002f);
		float i = (r / 0.0383f);
		
		//double d1 = d;
		//float  d = (float) d1;

		System.out.printf("Em dolar: %.2f \n", d);
		System.out.printf("Em Euro: %.2f \n", e);
		System.out.printf("Em Peso Argentino: %.2f \n", p);
		System.out.printf("Em Libra: %.2f \n", l);
		System.out.printf("Em Iene: %.2f \n", i);

		sc.close();
	}

}
