package aula06;
import java.util.Scanner;
public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tipo de cliente [1-Residencia] [2-Comércio] [3-Indústria]: ");
        int tipoCliente = scanner.nextInt();
        System.out.print("Digite o consumo em kWh: ");
        double consumo = scanner.nextDouble();
        
        double KWh;
        
        switch (tipoCliente) {
            case 1:
                KWh = 0.60;
                break;
            case 2:
                KWh = 0.48;
                break;
            case 3:
                KWh = 1.29;
                break;
            default:
                System.out.println("Cliente inválido.");
                return;
        }
        
        double valorConta = consumo * KWh;
        System.out.printf("Valor da conta de luz: R$ %.2f\n", valorConta);
        
        scanner.close();
    }
}
