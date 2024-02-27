import java.util.Scanner;

public class Ex_1015 {
    /* EXERCÍCIO 1015 - DISTÂNCIA ENTRE DOIS PONTOS */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x1 = input.nextDouble(), y1 = input.nextDouble(), x2 = input.nextDouble(), y2 = input.nextDouble();
        double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.printf("%.4f\n", distancia);
        input.close();
    }
}
