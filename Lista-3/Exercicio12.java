import java.util.Scanner;

public class DescontoCarros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalCarrosAte2000 = 0;
        int totalGeral = 0;

        while (true) {
            System.out.println("Digite o ano do carro (0 para sair):");
            int anoCarro = scanner.nextInt();

            if (anoCarro == 0) {
                break;
            }

            totalGeral++;

            double desconto;
            if (anoCarro <= 2000) {
                desconto = 0.12;
                totalCarrosAte2000++;
            } else {
                desconto = 0.07;
            }

            System.out.println("Desconto para o carro de " + anoCarro + ": " + (desconto * 100) + "%");
        }

        System.out.println("Total de carros até 2000: " + totalCarrosAte2000);
        System.out.println("Total geral: " + totalGeral);
    }
}
