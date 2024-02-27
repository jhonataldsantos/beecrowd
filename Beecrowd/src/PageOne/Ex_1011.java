import java.util.Scanner;

public class Ex_1011 {
    public static void main(String[] args) {
        /* EXERCÍCIO 1011 - ESFERA */
        Scanner input = new Scanner(System.in);

        long raioEsfera = input.nextInt(); /*
                                            * Nesse caso, se utilizar o int, em valores extensos o programa dará
                                            * problema. O correto seria utilizar o Math.pow.
                                            */
        double pi = 3.14159;
        double calculoVolume = (4.0 / 3) * pi * (raioEsfera * raioEsfera * raioEsfera); // Poderia utilizar o
                                                                                        // Math.pow(raioEsfera, 3);

        /*
         * ''
         * Ao utilizar a fórmula, procure usar (4/3.0) ou (4.0/3), pois algumas
         * linguagens (dentre elas o C++), assumem que o resultado da divisão entre dois
         * inteiros é outro inteiro.
         */

        System.out.printf("VOLUME = %.3f\n", calculoVolume);
        input.close();
    }
}
