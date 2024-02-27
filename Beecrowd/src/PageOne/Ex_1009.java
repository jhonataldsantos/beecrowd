import java.util.Scanner;

public class Ex_1009 {
    public static void main(String[] args) {
        /* EXERCÍCIO 1009 - SALÁRIO COM BONUS */
        Scanner input = new Scanner(System.in);
        @SuppressWarnings("unused")
        String nomeDoVendedor = input.nextLine();
        double salarioFixo = input.nextDouble();
        double totalDeVendas = input.nextDouble();
        double salarioTotal = salarioFixo + (totalDeVendas * 0.15);

        System.out.printf("TOTAL = R$ %.2f\n", salarioTotal);

        input.close();
    }
}
