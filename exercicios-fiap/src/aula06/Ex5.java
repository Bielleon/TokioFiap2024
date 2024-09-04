package aula06;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        double n1 = scanner.nextDouble();
        System.out.print("Digite o segundo numero: ");
        double n2 = scanner.nextDouble();
        System.out.print("Digite a operacao [+] [-] [*] [/]: ");
        char operacao = scanner.next().charAt(0);
        
        double resultado = 0;
        
        switch (operacao) {
            case '+':
                resultado = n1 + n2;
                break;
            case '-':
                resultado = n1 - n2;
                break;
            case '*':
                resultado = n1 * n2;
                break;
            case '/':
                if (n2 != 0) {
                    resultado = n1 / n2;
                } else {
                    System.out.println("Divisão por zero não é permitida.");
                }
                break;
            default:
                System.out.println("Operação inválida.");
        }
        
        System.out.println("O resultado é: " + resultado);
        scanner.close();
    }
}