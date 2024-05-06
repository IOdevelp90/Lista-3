import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nível do professor (1, 2 ou 3):");
        int nivel = scanner.nextInt();

        double valorHoraAula;

        switch (nivel) {
            case 1:
                valorHoraAula = 12.0;
                break;
            case 2:
                valorHoraAula = 17.0;
                break;
            case 3:
                valorHoraAula = 25.0;
                break;
            default:
                System.out.println("Nível inválido.");
                return;
        }

        System.out.println("Digite a quantidade de horas/aula:");
        int horasAula = scanner.nextInt();

        double salario = valorHoraAula * horasAula;

        System.out.println("Salário do professor: R$ " + salario);
    }
}
