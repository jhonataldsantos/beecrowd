import java.util.Scanner;

public class Ex_1017 {
    public static void main(String[] args) {
        /* EXERCÍCIO 1017 - GASTO DE COMBUSTÍVEL */

        Scanner input = new Scanner(System.in);
        double horasDeViagem = input.nextInt(), kilometragemMedia = input.nextInt();
        double litrosNecessarios = (horasDeViagem * kilometragemMedia) / 12.0;
        System.out.printf("%.3f\n", litrosNecessarios);
        input.close();
    }
}