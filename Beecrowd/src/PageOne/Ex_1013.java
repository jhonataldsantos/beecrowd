import java.util.Scanner;

public class Ex_1013 {
    public static void main(String[] args) {
        /* EXERCÍCIO 1013 - O MAIOR */
        Scanner input = new Scanner(System.in);

        int A = input.nextInt(), B = input.nextInt(), C = input.nextInt(), maior;
        // int maiorPrimeiro = (A+B+abs(A-B)/2); -> Aparentemente não funciona

        if(A>B) {
            maior = A;
        } else {
            maior = B;
        } if(maior<C) {
            maior = C;
        }

        System.out.printf("%d eh o maior\n", maior);
        input.close();
    }
}