import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário:");
        String nomeFuncionario = scanner.nextLine();

        System.out.println("Digite o salário atual do funcionário:");
        double salarioAtual = scanner.nextDouble();

        System.out.println("Digite o valor do salário mínimo:");
        double salarioMinimo = scanner.nextDouble();

        double novoSalario;
        double reajuste;
        double novoSalarioMinimo;

        if (salarioAtual < salarioMinimo * 3) {
            reajuste = salarioAtual * 0.5;
        } else if (salarioAtual >= salarioMinimo * 3 && salarioAtual <= salarioMinimo * 10) {
            reajuste = salarioAtual * 0.2;
        } else if (salarioAtual > salarioMinimo * 10 && salarioAtual <= salarioMinimo * 20) {
            reajuste = salarioAtual * 0.15;
        } else {
            reajuste = salarioAtual * 0.1;
        }

        novoSalario = salarioAtual + reajuste;
        novoSalarioMinimo = salarioMinimo + reajuste;

        System.out.println("Nome do funcionário: " + nomeFuncionario);
        System.out.println("Salário atual: R$ " + salarioAtual);
        System.out.println("Reajuste: R$ " + reajuste);
        System.out.println("Novo salário: R$ " + novoSalario);
        System.out.println("Novo salário mínimo: R$ " + novoSalarioMinimo);

        double aumentoFolha = novoSalario - salarioAtual;
        System.out.println("Aumento na folha de pagamento: R$ " + aumentoFolha);
    }
}
