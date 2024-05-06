import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalHomens = 0;
        int totalMulheres = 0;

        for (int i = 1; i <= 56; i++) {
            System.out.println("Digite o nome da pessoa " + i + ":");
            String nome = scanner.nextLine();

            System.out.println("Digite o sexo da pessoa " + i + " (M/F):");
            char sexo = scanner.next().charAt(0);

            if (sexo == 'M') {
                totalHomens++;
                System.out.println(nome + " é homem.");
            } else if (sexo == 'F') {
                totalMulheres++;
                System.out.println(nome + " é mulher.");
            } else {
                System.out.println("Sexo inválido para " + nome);
            }

            scanner.nextLine(); 
        }

        System.out.println("Total de homens: " + totalHomens);
        System.out.println("Total de mulheres: " + totalMulheres);
    }
}
