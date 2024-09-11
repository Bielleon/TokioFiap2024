package aula09;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> listaNomes = new ArrayList();
		
		String resposta = "";
		
		while (true) {
			System.out.println("Digite o nome da pessoa: [Enter vazio para finalizar]");
			resposta = sc.nextLine();
			
			if(!resposta.isEmpty()) {
				listaNomes.add(resposta);
			}else {
				break;
			}
		}
		for (int i = listaNomes.size() - 1; i >= 0; i--) {
			System.out.println(listaNomes.get(i));
			
		}

	}

}
