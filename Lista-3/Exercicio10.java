import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite a idade da pessoa " + i + ":");
            int idade = scanner.nextInt();

            if (idade >= 18) {
                System.out.println("Pessoa " + i + " é maior de idade.");
            } else {
                System.out.println("Pessoa " + i + " é menor de idade.");
            }
        }
    }
}
