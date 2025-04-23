package devdojo.exercises;

import java.util.*;

public class Eight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Integer[] numbers = new Integer[3];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Informe um número: ");
            numbers[i] = input.nextInt();
        }

        List<Integer> integerList = Arrays.asList(numbers);
        integerList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        /*
        A resolução abaixo foi feita apenas para fins didáticos, uma vez que apresenta diversas limitações, como:
        dificuldade de compreensão, escalabilidade, reuso e muito mais.

        if (numbers[0] > numbers[1] || numbers[0] > numbers[2]) {
            if (numbers[1] > numbers[2]) {
                if (numbers[0] > numbers[1]) {
                    System.out.printf("%d | %d | %d", numbers[0], numbers[1], numbers[2]);
                } else {
                    System.out.printf("%d | %d | %d", numbers[1], numbers[0], numbers[2]);
                }
            } else if (numbers[0] > numbers[2]) {
                System.out.printf("%d | %d | %d", numbers[0], numbers[2], numbers[1]);
            } else {
                System.out.printf("%d | %d | %d", numbers[2], numbers[0], numbers[1]);
            }
        } else if (numbers[1] > numbers[2]) {
            System.out.printf("%d | %d | %d", numbers[1], numbers[2], numbers[0]);
        } else {
            System.out.printf("%d | %d | %d", numbers[2], numbers[1], numbers[0]);
        }
        */
    }

}
