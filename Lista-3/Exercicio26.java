import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalDesconto = 0;
        int totalCarrosAte2000 = 0;

        while (true) {
            System.out.println("Digite o ano do veículo (0 para sair):");
            int ano = scanner.nextInt();

            if (ano == 0) {
                break;
            }

            System.out.println("Digite o valor do veículo:");
            double valorVeiculo = scanner.nextDouble();

            double desconto;
            if (ano <= 2000) {
                desconto = valorVeiculo * 0.12;
                totalCarrosAte2000++;
            } else {
                desconto = valorVeiculo * 0.07;
            }

            totalDesconto += desconto;
            double valorPago = valorVeiculo - desconto;

            System.out.println("Desconto aplicado: R$ " + desconto);
            System.out.println("Valor a ser pago: R$ " + valorPago);
        }

        System.out.println("Total de desconto concedido: R$ " + totalDesconto);
        System.out.println("Total de carros até 2000: " + totalCarrosAte2000);
    }
}
