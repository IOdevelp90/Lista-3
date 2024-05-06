import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a cotação do dólar:");
        double cotacaoDolar = scanner.nextDouble();

        System.out.println("Digite a quantidade de dólares:");
        double quantidadeDolar = scanner.nextDouble();

        double valorReal = quantidadeDolar * cotacaoDolar;

        System.out.println("O valor em reais é: R$ " + valorReal);
    }
}
