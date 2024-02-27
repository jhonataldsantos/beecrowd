import java.util.Scanner;

public class Ex_1012 {
    public static void main(String[] args) {
        /* EXERCÍCIO 1006 - ÁREA */
        Scanner input = new Scanner(System.in);

        double A = input.nextDouble(), B = input.nextDouble(), C = input.nextDouble(), pi = 3.14159;

        double areaTriangulo = (A * C) / 2;
        double areaCirculo = pi * (C * C);
        double areaTrapezio = ((A + B) * C) / 2;
        double areaQuadrado = B * B;
        double areaRetangulo = A * B;

        System.out.printf("TRIANGULO: %.3f\nCIRCULO: %.3f\nTRAPEZIO: %.3f\nQUADRADO: %.3f\nRETANGULO: %.3f\n",
                areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo);
        input.close();
    }
}
