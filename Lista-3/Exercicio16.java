import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalDesconto = 0;
        double totalPago = 0;

        while (true) {
            System.out.println("Digite o tipo de combustível (álcool/gasolina/diesel):");
            
			 String tipoCombustivel = scanner.nextLine();
            if (tipoCombustivel.equalsIgnoreCase("alcool") || tipoCombustivel.equalsIgnoreCase("gasolina") || tipoCombustivel.equalsIgnoreCase("diesel")) {
                System.out.println("Digite o valor do veículo (0 para encerrar):");
                double valorVeiculo = scanner.nextDouble();

                if (valorVeiculo == 0) {
                    break;
                }

                double desconto;
                if (tipoCombustivel.equalsIgnoreCase("alcool")) {
                    desconto = valorVeiculo * 0.25;
                } else if (tipoCombustivel.equalsIgnoreCase("gasolina")) {
                    desconto = valorVeiculo * 0.21;
                } else {
                    desconto = valorVeiculo * 0.14;
                }

                totalDesconto += desconto;
                totalPago += valorVeiculo - desconto;

                System.out.println("Desconto para o veículo de " + tipoCombustivel + ": R$ " + desconto);
            } else {
                System.out.println("Tipo de combustível inválido.");
            }

            scanner.nextLine(); 
        }

        System.out.println("Total de desconto: R$ " + totalDesconto);
        System.out.println("Total pago pelos clientes: R$ " + totalPago);
    }
}
