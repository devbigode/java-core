package devdojo.exercises;

import java.util.Scanner;

public class Ten {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] grades = new double[3];

        for (int i = 0; i < grades.length; i++) {
            System.out.printf("%s %d: ", "Informe a nota", (i + 1));
            grades[i] = input.nextDouble();
        }

        double average = (grades[0] + grades[1] + grades[2]) / grades.length;
        System.out.printf("Média das notas: %.2f", average);

    }
}
