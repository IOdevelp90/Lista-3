import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do pretendente:");
        String nome = scanner.nextLine();

        System.out.println("Digite a idade do pretendente:");
        int idade = scanner.nextInt();

        System.out.println("Digite o grupo de risco do pretendente (Baixo - 1, Médio - 2, Alto - 3):");
        int grupoRisco = scanner.nextInt();

        String categoria;

        if (idade >= 17 && idade <= 20) {
            switch (grupoRisco) {
                case 1:
                    categoria = "Categoria 1";
                    break;
                case 2:
                    categoria = "Categoria 2";
                    break;
                case 3:
                    categoria = "Categoria 3";
                    break;
                default:
                    categoria = "Não se enquadra em nenhuma categoria";
                    break;
            }
        } else if (idade >= 21 && idade <= 24) {
            switch (grupoRisco) {
                case 2:
                    categoria = "Categoria 2";
                    break;
                case 3:
                    categoria = "Categoria 3";
                    break;
                default:
                    categoria = "Não se enquadra em nenhuma categoria";
                    break;
            }
        } else if (idade >= 25 && idade <= 34) {
            switch (grupoRisco) {
                case 3:
                    categoria = "Categoria 3";
                    break;
                default:
                    categoria = "Não se enquadra em nenhuma categoria";
                    break;
            }
        } else if (idade >= 35 && idade <= 64) {
            categoria = "Categoria 4";
        } else if (idade >= 65 && idade <= 70) {
            categoria = "Categoria 5";
        } else {
            categoria = "Não se enquadra em nenhuma categoria";
        }

        System.out.println("Nome do pretendente: " + nome);
        System.out.println("Categoria de seguro: " + categoria);
    }
}
