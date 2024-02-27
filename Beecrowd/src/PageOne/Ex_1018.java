import java.util.Scanner;

public class Ex_1018 {
    public static void main(String[] args) {
        /* EXERCÍCIO 1018 - CÉDULAS */

        Scanner input = new Scanner(System.in);
        int valorLido = input.nextInt(), notaDeCem = 0, notaDeCinquenta = 0, notaDeVinte = 0, notaDeDez = 0,
                notaDeCinco = 0, notaDeDois = 0, notaDeUm = 0;

        System.out.printf("%d\n", valorLido);
        while ((notaDeCem * 100) < valorLido - 100) {
            notaDeCem++;
        }
        valorLido = valorLido - notaDeCem * 100;
        while ((notaDeCinquenta * 50) < valorLido - 50) {
            notaDeCinquenta++;
        }
        valorLido = valorLido - notaDeCinquenta * 50;
        while ((notaDeVinte * 20) < valorLido - 20) {
            notaDeVinte++;
        }
        valorLido = valorLido - notaDeVinte * 20;
        while ((notaDeDez * 10) < valorLido - 10) {
            notaDeDez++;
        }
        valorLido = valorLido - notaDeDez * 10;
        while ((notaDeCinco * 5) < valorLido - 5) {
            notaDeCinco++;
        }
        valorLido = valorLido - notaDeCinco * 5;
        while ((notaDeDois * 2) <= valorLido - 2) {
            notaDeDois++;
        }
        valorLido = valorLido - notaDeDois * 2;
        while ((notaDeUm * 1) < valorLido) {
            notaDeUm++;
        }
        valorLido = valorLido - notaDeUm * 1;

        System.out.printf("%d nota(s) de R$ 100,00\n", notaDeCem);
        System.out.printf("%d nota(s) de R$ 50,00\n", notaDeCinquenta);
        System.out.printf("%d nota(s) de R$ 20,00\n", notaDeVinte);
        System.out.printf("%d nota(s) de R$ 10,00\n", notaDeDez);
        System.out.printf("%d nota(s) de R$ 5,00\n", notaDeCinco);
        System.out.printf("%d nota(s) de R$ 2,00\n", notaDeDois);
        System.out.printf("%d nota(s) de R$ 1,00\n", notaDeUm);
        input.close();
    }
}