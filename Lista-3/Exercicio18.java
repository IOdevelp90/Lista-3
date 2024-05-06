import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário:");
        String nomeFuncionario = scanner.nextLine();

        System.out.println("Digite o sexo do funcionário (M/F):");
        char sexo = scanner.next().charAt(0);

        System.out.println("Digite a idade do funcionário:");
        int idade = scanner.nextInt();

        System.out.println("Digite o salário fixo do funcionário:");
        double salarioFixo = scanner.nextDouble();

        double abono;

        if (sexo == 'M') {
            if (idade >= 30) {
                abono = 100.0;
            } else {
                abono = 50.0;
            }
        } else {
            if (idade >= 30) {
                abono = 200.0;
            } else {
                abono = 80.0;
            }
        }

        double salarioLiquido = salarioFixo + abono;

        System.out.println("Nome do funcionário: " + nomeFuncionario);
        System.out.println("Salário líquido: R$ " + salarioLiquido);
    }
}
