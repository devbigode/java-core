package devdojo.exercises;

import java.util.Scanner;
import java.util.Arrays;

public class Eleven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Qual é o seu nome? ");
        String name = input.nextLine();

        double[] grades = new double[4];

        for (int i = 0; i < grades.length; i++) {
            System.out.printf("Digite a nota %d: ", (i + 1));
            grades[i] = input.nextDouble();
        }

        double avg = Arrays
                .stream(grades)
                .average()
                .getAsDouble();

        System.out.println("\nMédia final: " + avg);

        if (avg >= 7){
            System.out.printf("%s está aprovado!", name);
        } else{
            System.out.println(name + " não atingiu a média mínima.");
        }

    }
}
