package PageTwo;

import java.util.Scanner;

public class Ex_1040 {
    public static void main(String[] args) {
        /* EXERCÍCIO 1040 - MEDIA 3 */
        Scanner input = new Scanner(System.in);
        float N1 = input.nextFloat(), N2 = input.nextFloat(), N3 = input.nextFloat(), N4 = input.nextFloat();
        // Tive que mudar pra float, porque por algum motivo em Double tava arredondando
        // para 4.9, e float arredonda pra 4.8
        float media = ((N1 * 2) + (N2 * 3) + (N3 * 4) + (N4 * 1)) / 10;
        System.out.printf("Media: %.1f\n", media);
        if (media >= 7) {
            System.out.println("Aluno aprovado.");
        } else if (media >= 5 && media <= 6.9) {
            System.out.println("Aluno em exame.");
            double notaExame = input.nextDouble();
            System.out.printf("Nota do exame: %.1f\n", notaExame);
            double novaMedia = (media + notaExame) / 2;
            if (novaMedia >= 5)
                System.out.println("Aluno aprovado.");
            else
                System.out.println("Aluno reprovado.");
            System.out.printf("Media final: %.1f\n", novaMedia);
        } else {
            System.out.println("Aluno reprovado.");
        }
        input.close();
    }
}
