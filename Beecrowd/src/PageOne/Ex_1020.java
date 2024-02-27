import java.util.Scanner;

public class Ex_1020 {
    public static void main(String[] args) {
        /* EXERCÍCIO 1020 - IDADE EM DIAS */
        Scanner input = new Scanner(System.in);
        int qtdDias = input.nextInt(), ano = 0, mes = 0, dia = 0;
        while (qtdDias-365>ano*365) {
             ano++;
        } qtdDias = qtdDias - ano * 365; 
        while (qtdDias-30>=mes*30) {
            mes++;
        } qtdDias = qtdDias - mes * 30; 
        while (qtdDias>dia) {
            dia++;
        } qtdDias = qtdDias - dia;
        System.out.printf("%d ano(s)\n", ano);
        System.out.printf("%d mes(es)\n", mes);
        System.out.printf("%d dia(s)\n", dia);
        input.close();
    }
}