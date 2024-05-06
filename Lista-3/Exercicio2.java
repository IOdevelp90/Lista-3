import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a distância total percorrida (em km):");
        double distanciaTotal = scanner.nextDouble();

        System.out.println("Digite o total de combustível gasto (em litros):");
        double combustivelGasto = scanner.nextDouble();

        double consumoMedio = distanciaTotal / combustivelGasto;

        System.out.println("O consumo médio do automóvel é: " + consumoMedio + " km/l");
    }
}
