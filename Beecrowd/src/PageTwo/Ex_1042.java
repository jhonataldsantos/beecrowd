package PageTwo;

import java.util.Scanner;

public class Ex_1042 {
    public static void main(String[] args) {
        /* EXERCÍCIO 1042 - SORT SIMPLES */
        Scanner input = new Scanner(System.in);
        int A = input.nextInt(), B = input.nextInt(), C = input.nextInt();
        input.close();

        if (A < B && A < C && B < C) {
            System.out.println(A);
            System.out.println(B);
            System.out.println(C);
        } else if (A < B && A < C && C < B) {
            System.out.println(A);
            System.out.println(C);
            System.out.println(B);
        } else if (B < A && B < C && A < C) {
            System.out.println(B);
            System.out.println(A);
            System.out.println(C);
        } else if (B < A && B < C && C < A) {
            System.out.println(B);
            System.out.println(C);
            System.out.println(A);
        } else if (C < A && C < B && A < B) {
            System.out.println(C);
            System.out.println(A);
            System.out.println(B);
        } else {
            System.out.println(C);
            System.out.println(B);
            System.out.println(A);
        }
        System.out.println("");
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
    }
}
