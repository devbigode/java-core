package devdojo.exercises;

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[2];

        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%d - %s", (i + 1), "Digite um número: ");
            numbers[i] = input.nextInt();
        }

        if (numbers[0] == numbers[1]){
            int addition = numbers[0] + numbers[1];
            System.out.printf("%s %d + %d = %d", "A soma entre os números", numbers[0], numbers[1], addition);
        } else {
            int multiplication = numbers[0] * numbers[1];
            System.out.printf("%s %d x %d = %d", "O produto entre os números", numbers[0], numbers[1], multiplication);
        }

    }
}
