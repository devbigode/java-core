package devdojo.exercises;

import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe um número: ");
        double x = input.nextDouble();

        double percent = (x) + (x * 0.05);
        System.out.printf("Valor com reajuste de 5%%: %.2f", percent);

    }
}
