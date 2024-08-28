package aula05;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n1 = 1;
		float n2 = 2.1f;
		double n3 = 3.1;

		System.out.println(n1 + "\n" + n2 + "\n" + n3 + "\n");
		
		String str1 = Integer.toString(n1);
		String str2 = Float.toString(n2);
		String str3 = Double.toString(n3);
		
		str1 = "N1";
		str2 = "N2";
		str3 = "N3";
		
		System.out.println(str1 + "\n" + str2 + "\n" + str3 + "\n");
		
		

		sc.close();

	}
}
