import java.util.Scanner;

public class Ex_1007 {
    public static void main(String[] args) {
        /* EXERCÍCIO 1007 - DIFERENÇA */
        Scanner input = new Scanner(System.in);
        int A,B,C,D;
        A = input.nextInt();
        B = input.nextInt();
        C = input.nextInt();
        D = input.nextInt();

        int diferenca = (A * B - C * D);
        System.out.println("DIFERENCA = "+diferenca);
        input.close();
    }
}
