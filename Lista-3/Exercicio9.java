import java.util.Scanner;

public class Exercicio9{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        for (int i = 0; i < 80; i++) {
            System.out.println("Digite um número:");
            int numero = scanner.nextInt();

            if (numero >= 10 && numero <= 150) {
                count++;
            }
        }

        System.out.println("Total de números no intervalo: " + count);
    }
}
