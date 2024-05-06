import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do vendedor:");
        String nomeVendedor = scanner.nextLine();

        System.out.println("Digite o salário fixo do vendedor:");
        double salarioFixo = scanner.nextDouble();

        System.out.println("Digite o total de vendas efetuadas pelo vendedor:");
        double totalVendas = scanner.nextDouble();

        double comissao = totalVendas * 0.15;
        double salarioFinal = salarioFixo + comissao;

        System.out.println("Nome do vendedor: " + nomeVendedor);
        System.out.println("Salário fixo: R$ " + salarioFixo);
        System.out.println("Salário final: R$ " + salarioFinal);
    }
}
