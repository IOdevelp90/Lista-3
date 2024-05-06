import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o custo de fábrica do carro:");
        double custoFabrica = scanner.nextDouble();

        double percentualDistribuidor = 0.28;
        double impostos = 0.45;

        double custoConsumidor = custoFabrica + (custoFabrica * percentualDistribuidor) + (custoFabrica * impostos);

        System.out.println("O custo ao consumidor do carro é: R$ " + custoConsumidor);
    }
}
