package devdojo.exercises;

import java.util.Scanner;

public class TwentyTwo {

    public static void division(int x, int y){
        if (y == 0) return;

        int quo = x / y;
        int mod = x % y;

        System.out.printf("Quociente: %d | Resto: %d", quo, mod);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite dois números: ");

        int x = input.nextInt();
        int y = input.nextInt();

        division(x, y);
    }
}
