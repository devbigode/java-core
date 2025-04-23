package devdojo.exercises;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] numbers = new double[3];

        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%d - %s", (i + 1), "Digite um número: ");
            numbers[i] = input.nextDouble();
        }

        double addition = numbers[0] + numbers[1];
        System.out.println("Soma entre A + B = " + addition);
        if (addition < numbers[2]){
            System.out.println("A soma entre os dois primeiros números é MENOR que o último.");
        } else {
            System.out.println("A soma entre os dois primeiros números NÃO é menor que o último.");
        }
    }
}
