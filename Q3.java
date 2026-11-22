import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor da compra: R$ ");
        double valorCompra = entrada.nextDouble();

        System.out.print("Digite o desconto (%): ");
        double desconto = entrada.nextDouble();

        double valorDesconto = valorCompra * desconto / 100;
        double valorFinal = valorCompra - valorDesconto;

        System.out.printf("Valor do desconto: R$ %.2f%n", valorDesconto);
        System.out.printf("Valor final: R$ %.2f%n", valorFinal);

        entrada.close();
    }
}
