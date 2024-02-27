import java.util.Scanner;

public class Ex_1016 {
    public static void main(String[] args) {
        /* EXERCÍCIO 1016 - DISTÂNCIA */

        Scanner input = new Scanner(System.in);
        int kmPercorrido = input.nextInt();
        int tempo = kmPercorrido * 2;
        System.out.printf("%d minutos\n", tempo);
        input.close();
    }
}
