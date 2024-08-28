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

		System.out.println("Em dolar: " + d);
		System.out.println("Em Euro: " + e);
		System.out.println("Em Peso Argentino: " + p);
		System.out.println("Em Libra: " + l);
		System.out.println("Em Iene: " + i);

		sc.close();
	}

}
