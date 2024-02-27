import java.util.Scanner;

public class Ex_1036 {
    public static void main(String[] args) {
        /* EXERCÍCIO 1020 - FÓRMULA DE BHASKARA */
        Scanner input = new Scanner(System.in);
        double A = input.nextDouble(), B = input.nextDouble(), C = input.nextDouble();
        double delta = Math.pow(B, 2) - (4 * A * C);
        if (2 * A == 0 || delta < 0) {
            System.out.println("Impossivel calcular");
        } else {
            double raiz1 = ((-B) + Math.sqrt(delta)) / (2 * A);
            double raiz2 = ((-B) - Math.sqrt(delta)) / (2 * A);
            System.out.printf("R1 = %.5f\n", raiz1);
            System.out.printf("R2 = %.5f\n", raiz2);
            input.close();
        }
    }
}