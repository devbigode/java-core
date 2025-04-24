package devdojo.exercises;

import java.util.Scanner;

public class NineteenAndTwenty {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("A tabuada de qual número você deseja saber? ");
        int x = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            int result = x * i;
            System.out.printf("%d x %d = %d%n", x, i, result);
        }
    }
}
