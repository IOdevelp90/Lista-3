import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalCusto = 0;
        double totalVenda = 0;

        for (int i = 1; i <= 40; i++) {
            System.out.println("Produto " + i + ":");
            System.out.println("Digite o preço de custo:");
            double precoCusto = scanner.nextDouble();
            totalCusto += precoCusto;

            System.out.println("Digite o preço de venda:");
            double precoVenda = scanner.nextDouble();
            totalVenda += precoVenda;

            if (precoVenda > precoCusto) {
                System.out.println("Lucro para o produto " + i);
            } else if (precoVenda < precoCusto) {
                System.out.println("Prejuízo para o produto " + i);
            } else {
                System.out.println("Empate para o produto " + i);
            }
        }

        System.out.println("Média de preço de custo: " + (totalCusto / 40));
        System.out.println("Média de preço de venda: " + (totalVenda / 40));
    }
}
