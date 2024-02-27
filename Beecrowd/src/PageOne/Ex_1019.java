import java.util.Scanner;

public class Ex_1019 {
    public static void main(String[] args) {
        /* EXERCÍCIO 1019 - CONVERSÃO DE TEMPO */

        Scanner input = new Scanner(System.in);
        int entradaDeTempo = input.nextInt(), hora = 0, minuto = 0, segundo = 0;

        while (entradaDeTempo - 3600 >= hora * 3600) {
            hora++;
        }
        entradaDeTempo = entradaDeTempo - (hora * 3600);
        while (entradaDeTempo - 60 >= minuto * 60) {
            minuto++;
        }
        entradaDeTempo = entradaDeTempo - (minuto * 60);
        while (entradaDeTempo > segundo * 1) {
            segundo++;
        }
        entradaDeTempo = entradaDeTempo - segundo;
        System.out.printf("%d:%d:%d\n", hora, minuto, segundo);
        input.close();
    }
}