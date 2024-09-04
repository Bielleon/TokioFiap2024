package aula06;

public class Ex7 {
	public static void main(String[] args) {
		int a = 5, b = 7, c = 4, d = 8;

		boolean resultadoA = (a <= b) && (b < d);
		boolean resultadoB = (a == b) || (c != b);
		boolean resultadoC = (d > a) && (c >= b);
		boolean resultadoD = (a <= b) || (c <= d);
		boolean resultadoE = ((b > c) || (c < a)) && (d <= b);

		System.out.println("A. " + resultadoA); 
		System.out.println("B. " + resultadoB); 
		System.out.println("C. " + resultadoC); 
		System.out.println("D. " + resultadoD); 
		System.out.println("E. " + resultadoE);
	}
}