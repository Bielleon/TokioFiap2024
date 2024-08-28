package aula05;
import java.util.Scanner;
public class Ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do produto:");
		double valor = sc.nextDouble();
		
		System.out.println("Digite o valor pago pelo prodruto:");
		double pago = sc.nextDouble();
		
		if(pago > valor) {
			System.out.println("O seu troco é " + (pago - valor));
		}else {
			System.out.println("Infelizmente falta dinheiro seu pobre");
		}
		

	}

}
