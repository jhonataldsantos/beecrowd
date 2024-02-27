import java.util.Scanner;

public class Ex_1014 {
    public static void main(String[] args) {
        /* EXERCÍCIO 1014 - CONSUMO */
        Scanner input = new Scanner(System.in);
        int distancia = input.nextInt();
        double combustivel = input.nextDouble();
        double kmPorLitro = distancia/combustivel;

        System.out.printf("%.3f km/l\n", kmPorLitro);

        input.close();
    }
}
