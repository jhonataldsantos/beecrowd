import java.util.Scanner;

public class Ex_1021 {
    public static void main(String[] args) {
        /* EXERCÍCIO 1021 - NOTAS E MOEDAS */
        Scanner input = new Scanner(System.in);
        double valorLido = input.nextDouble();
        int notaDeCem = 0, notaDeCinquenta = 0, notaDeVinte = 0, notaDeDez = 0,
                notaDeCinco = 0, notaDeDois = 0;

        // CÉDULAS
        System.out.printf("NOTAS:\n");
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
        System.out.printf("%d nota(s) de R$ 100.00\n", notaDeCem);
        System.out.printf("%d nota(s) de R$ 50.00\n", notaDeCinquenta);
        System.out.printf("%d nota(s) de R$ 20.00\n", notaDeVinte);
        System.out.printf("%d nota(s) de R$ 10.00\n", notaDeDez);
        System.out.printf("%d nota(s) de R$ 5.00\n", notaDeCinco);
        System.out.printf("%d nota(s) de R$ 2.00\n", notaDeDois);

        // MOEDAS
        System.out.printf("MOEDAS:\n");
        int moedaDeCem = 0, moedaDeCinquenta = 0, moedaDeVinteECinco = 0, moedaDeDez = 0,
                moedaDeCinco = 0, moedaDeUm = 0;

        while ((moedaDeCem * 1) < valorLido -1) {
            moedaDeCem++;
        }
        valorLido = valorLido - moedaDeCem * 1;
        while ((moedaDeCinquenta * 0.5) < valorLido - 0.5) {
            moedaDeCinquenta++;
        }
        valorLido = valorLido - moedaDeCinquenta * 0.5;
        while ((moedaDeVinteECinco * 0.25) < valorLido - 0.25) {
            moedaDeVinteECinco++;
        }
        valorLido = valorLido - moedaDeVinteECinco * 0.25;
        while ((moedaDeDez * 0.1) < valorLido - 0.1) {
            moedaDeDez++;
        }
        valorLido = valorLido - moedaDeDez * 0.1;
        while ((moedaDeCinco * 0.05) < valorLido - 0.05) {
            moedaDeCinco++;
        }
        valorLido = valorLido - moedaDeCinco * 0.05;
        while ((moedaDeUm * 0.011) <= valorLido - 0.009) {
            moedaDeUm++;
        }
        valorLido = valorLido - moedaDeUm * 0.01;

        System.out.printf("%d moeda(s) de R$ 1.00\n", moedaDeCem);
        System.out.printf("%d moeda(s) de R$ 0.50\n", moedaDeCinquenta);
        System.out.printf("%d moeda(s) de R$ 0.25\n", moedaDeVinteECinco);
        System.out.printf("%d moeda(s) de R$ 0.10\n", moedaDeDez);
        System.out.printf("%d moeda(s) de R$ 0.05\n", moedaDeCinco);
        System.out.printf("%d moeda(s) de R$ 0.01\n", moedaDeUm);
        input.close();
    }
}