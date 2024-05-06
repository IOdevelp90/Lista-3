import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o sexo (M/F):");
        char sexo = scanner.next().charAt(0);

        System.out.println("Digite a altura (em metros):");
        double altura = scanner.nextDouble();

        System.out.println("Digite a idade:");
        int idade = scanner.nextInt();

        double pesoIdeal;

        if (sexo == 'M') {
            if (altura > 1.70) {
                if (idade <= 20) {
                    pesoIdeal = (72.7 * altura) - 58;
                } else if (idade >= 21 && idade <= 39) {
                    pesoIdeal = (72.7 * altura) - 53;
                } else {
                    pesoIdeal = (72.7 * altura) - 45;
                }
            } else {
                if (idade <= 40) {
                    pesoIdeal = (72.7 * altura) - 50;
                } else {
                    pesoIdeal = (72.7 * altura) - 58;
                }
            }
        } else {
            if (altura > 1.50) {
                if (idade >= 35) {
                    pesoIdeal = (62.1 * altura) - 45;
                } else {
                    pesoIdeal = (62.1 * altura) - 44.7;
                }
            } else {
                if (idade >= 35) {
                    pesoIdeal = (62.1 * altura) - 45;
                } else {
                    pesoIdeal = (62.1 * altura) - 49;
                }
            }
        }

        System.out.println("O peso ideal é: " + pesoIdeal + " kg");
    }
}
