package devdojo.exercises;

import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int x = input.nextInt();

        System.out.println("Antecessor: " + (x - 1));
        System.out.println("Sucessor: " + (x + 1));
    }
}
