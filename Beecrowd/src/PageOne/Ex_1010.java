import java.util.Scanner;

public class Ex_1010 {
    public static void main(String[] args) {
        /* EXERCÍCIO 1010 - CÁLCULO SIMPLES */
        Scanner input = new Scanner(System.in);
        @SuppressWarnings("unused")
        int codigoPeca = input.nextInt(), numeroPeca = input.nextInt();
        double valorPeca = input.nextDouble();

        @SuppressWarnings("unused")
        int codigoPecaDois = input.nextInt(), numeroPeca2 = input.nextInt();
        double valorPeca2 = input.nextDouble();

        double valorTotal = (numeroPeca * valorPeca) + (numeroPeca2 * valorPeca2);
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorTotal);
        input.close();
    }
}
