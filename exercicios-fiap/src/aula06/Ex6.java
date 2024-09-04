package aula06;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o ano de nascimento: ");
        int anoNasc = scanner.nextInt();
        
        int idade = 2024 - anoNasc;
        
        if (idade < 16) {
            System.out.println("Voto proibido.");
        } else if (idade >= 18 && idade <= 70) {
            System.out.println("Voto obrigatório.");
        } else {
            System.out.println("Voto opcional.");
        }
        
        scanner.close();
    }
}