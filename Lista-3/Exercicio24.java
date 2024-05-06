import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do estudante:");
        String nome = scanner.nextLine();

        System.out.println("Digite a nota do trabalho de laboratório:");
        double notaLaboratorio = scanner.nextDouble();

        System.out.println("Digite a nota da avaliação semestral:");
        double notaSemestral = scanner.nextDouble();

        System.out.println("Digite a nota do exame final:");
        double notaExameFinal = scanner.nextDouble();

        double notaFinal = (notaLaboratorio * 2 + notaSemestral * 3 + notaExameFinal * 5) / 10;

        System.out.println("Nota final de " + nome + ": " + notaFinal);

        if (notaFinal >= 8) {
            System.out.println("Classificação: A");
        } else if (notaFinal >= 7) {
            System.out.println("Classificação: B");
        } else if (notaFinal >= 6) {
            System.out.println("Classificação: C");
        } else if (notaFinal >= 5) {
            System.out.println("Classificação: D");
        } else {
            System.out.println("Classificação: R");
        }
    }
}
