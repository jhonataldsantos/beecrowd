import java.util.Scanner;

public class Ex_1008 {
    public static void main(String[] args) {
        /* EXERCÍCIO 1008 - SALÁRIO */
        Scanner input = new Scanner(System.in);

        int numeroFuncionario, horasTrabalhadas;
        double salarioFuncionario;
        numeroFuncionario = input.nextInt();
        horasTrabalhadas = input.nextInt();
        salarioFuncionario = input.nextDouble();

        double salarioTotal = salarioFuncionario * horasTrabalhadas;

        System.out.printf("NUMBER = %d\n", numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f\n", salarioTotal);

        input.close();
    }
}
