package PageTwo;

import java.util.Scanner;

public class Ex_1041 {
    public static void main(String[] args) {
        /* EXERCÍCIO 1041 - COORDENADAS DE UM PONTO */
        Scanner input = new Scanner(System.in);
        float x = input.nextFloat(), y = input.nextFloat();
        if (x == 0 && y == 0) {
            System.out.println("Origem");
        } else if (x > 0 && y > 0) {
            System.out.println("Q1");
        } else if (x > 0 && y < 0) {
            System.out.println("Q4");
        } else if (x < 0 && y > 0) {
            System.out.println("Q2");
        } else if (x < 0 && y < 0) {
            System.out.println("Q3");
        } else if (x == 0) {
            System.out.println("Eixo Y");
        } else {
            System.out.println("Eixo X");
        }
        input.close();
    }
}
