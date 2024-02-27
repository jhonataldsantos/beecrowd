package PageTwo;

import java.util.Scanner;

public class Ex_1038 {
    public static void main(String[] args) {
        /* EXERCÍCIO 1038 - LANCHE */
        Scanner input = new Scanner(System.in);
        int codigo = input.nextInt(), quantidade = input.nextInt();
        double total = 0;
        switch (codigo) {
            case 1:
                total = quantidade * 4;
                break;
            case 2:
                total = quantidade * 4.5;
                break;
            case 3:
                total = quantidade * 5;
                break;
            case 4:
                total = quantidade * 2;
                break;
            case 5:
                total = quantidade * 1.5;
                break;
            default:
                break;
        }
        System.out.printf("Total: R$ %.2f\n", total);
        input.close();
    }
}
