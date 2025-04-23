package devdojo.exercises;

import java.util.Scanner;

public class Five {
    public static final double SALARIO_MINIMO = 1293.20;

    public static void calculate(double salary){
        int result = (int) (salary / SALARIO_MINIMO);

        if (result > 0 ){
            System.out.println("Você ganha aproximadamente " + result + " salários mínimos.");
        } else {
            System.out.println("Você ainda não ganha nem sequer um salário mínimo.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe seu salário atual: ");
        double salary = input.nextDouble();

        calculate(salary);

    }
}
