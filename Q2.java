
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double precoLitro = 6.69;

        System.out.print("Digite o valor do abastecimento: R$ ");
        double valor = entrada.nextDouble();

        double litros = valor / precoLitro;

        System.out.printf("Litros abastecidos: %.4f litros%n", litros);

        entrada.close();
    }
}

