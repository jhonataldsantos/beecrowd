import java.util.Scanner;

public class Ex_1037 {
    public static void main(String[] args) {
        /* EXERCÍCIO 1037 - INTERVALO */
        Scanner input = new Scanner(System.in);
        double valorLido = input.nextDouble();

        if(valorLido>=0&&valorLido<=25) {
            System.out.println("Intervalo [0,25]");
        } else if(valorLido>25&&valorLido<=50) {
            System.out.println("Intervalo (25,50]");
        } else if(valorLido>50&&valorLido<=75) {
            System.out.println("Intervalo (50,75]");
        } else if(valorLido>75&&valorLido<=100) {
            System.out.println("Intervalo (75,100]");
        } else {
            System.out.println("Fora de intervalo");
        }
        input.close();
    }
}