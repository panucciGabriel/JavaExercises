package ExercicioDivisao;

import java.util.Scanner;

public class DivisionExercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o numerador: ");
        int numerado = scan.nextInt();

        System.out.println("Informe o divisor: ");
        int divisor = scan.nextInt();

        try {
            int resultado = numerado / divisor;
            System.out.println("Resultado da divisão: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não é permitida.");

        }
    }
}
