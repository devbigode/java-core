package devdojo.exercises;

import java.util.Scanner;

public class Thirteen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Qual é o seu nome? ");
        String name = input.nextLine();
        System.out.print("Qual é sua idade? ");
        int age = input.nextInt();

        if (age >= 18){
            System.out.printf("%s é MAIOR de idade.", name);
        } else {
            System.out.printf("%s é MENOR de idade.", name);
        }

    }
}
