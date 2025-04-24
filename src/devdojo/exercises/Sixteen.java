package devdojo.exercises;

import java.util.Scanner;

public class Sixteen {

    public static void isValid(double[] sides){
        if (sides.length != 3) return;

        double a = sides[0];
        double b = sides[1];
        double c = sides[2];

        if (a + b > c || a + c > b || b + c > a){
            System.out.print("Triângulo formado com sucesso. ");
            whichTriangle(a, b, c);
        } else {
            System.out.print("Os valores informados não formam um triângulo.");
        }

    }

    public static void whichTriangle(double a, double b, double c){
        if (a == b && a == c){
            System.out.println("Tipo: equilátero.");
        }

        if (a == b || a == c || b == c){
            System.out.println("Tipo: isósceles.");
        }

        if (a != b && a != c && b != c){
            System.out.println("Tipo: escaleno.");
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] sides = new double[3];

        for (int i = 0; i < sides.length; i++) {
            System.out.printf("Informe o lado %d: ", (i + 1));
            sides[i] = input.nextDouble();
        }

        isValid(sides);

    }
}
