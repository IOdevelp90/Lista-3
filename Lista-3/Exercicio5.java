import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da compra:");
        double valorCompra = scanner.nextDouble();

        double valorPrestacao = valorCompra / 5;

        System.out.println("O valor de cada prestação é: R$ " + valorPrestacao);
    }
}
