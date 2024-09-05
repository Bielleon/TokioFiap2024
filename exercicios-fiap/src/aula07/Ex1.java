package aula07;
import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String mensagem = "sim";
		
		while(mensagem.equals("sim")) {
			System.out.println("Ola mundo!");
			
			System.out.println("deseja exibir novamente?");
			mensagem = sc.nextLine();
		}
		
		System.out.println("Fim");
		
		
	}
}
