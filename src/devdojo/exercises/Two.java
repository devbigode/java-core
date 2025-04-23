package devdojo.exercises;

import java.util.Scanner;

public class Two {

    public static void checkPar(int x){
        if (x % 2 == 0){
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }
    }

    public static void checkPositive(int x){
        if (x >= 0){
            System.out.println("O número é positivo.");
        } else {
            System.out.println("O número é negativo.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();

        checkPar(x);
        checkPositive(x);

    }
}
