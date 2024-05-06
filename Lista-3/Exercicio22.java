import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tipo de cliente (1 para Residência, 2 para Comércio, 3 para Indústria):");
        int tipoCliente = scanner.nextInt();

        System.out.println("Digite a quantidade de KW/h consumidos:");
        double quantidadeKW = scanner.nextDouble();

        double valorKW;

        switch (tipoCliente) {
            case 1:
                valorKW = 0.60;
                break;
            case 2:
                valorKW = 0.48;
                break;
            case 3:
                valorKW = 1.29;
                break;
            default:
                System.out.println("Tipo de cliente inválido.");
                return;
        }

        double valorConta = quantidadeKW * valorKW;
        System.out.println("Valor da conta de luz: R$ " + valorConta);
    }
}
