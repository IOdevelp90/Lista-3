import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalAptos = 0;
        int totalInaptos = 0;

        System.out.println("Digite a quantidade de pessoas:");
        int quantidade = scanner.nextInt();

        for (int i = 1; i <= quantidade; i++) {
            System.out.println("Dados da pessoa " + i + ":");
            scanner.nextLine(); // Limpar o buffer do scanner

            System.out.println("Nome:");
            String nome = scanner.nextLine();

            System.out.println("Sexo (M/F):");
            char sexo = scanner.next().charAt(0);

            System.out.println("Idade:");
            int idade = scanner.nextInt();

            System.out.println("Saúde (apto/inapto):");
            String saude = scanner.next();

            if ((sexo == 'M' && idade >= 18 && idade <= 45 && saude.equalsIgnoreCase("apto"))
                    || (sexo == 'F' && idade >= 18 && idade <= 40 && saude.equalsIgnoreCase("apto"))) {
                totalAptos++;
                System.out.println(nome + " está apto para o serviço militar.");
            } else {
                totalInaptos++;
                System.out.println(nome + " não está apto para o serviço militar.");
            }
        }

        System.out.println("Total aptos: " + totalAptos);
        System.out.println("Total inaptos: " + totalInaptos);
    }
}
