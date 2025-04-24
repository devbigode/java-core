package devdojo.exercises;

import java.util.Scanner;

public class Fourteen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe dois números: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        double a = x;

        x = y;
        y = a;

        System.out.printf("Valor de A = %.2f%nValor de B = %.2f", x, y);

    }
}
