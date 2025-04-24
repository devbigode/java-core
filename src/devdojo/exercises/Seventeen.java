package devdojo.exercises;

import java.util.Scanner;

public class Seventeen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a temperatura atual (°F): ");
        double fahrenheit = input.nextInt();

        double celsius = (5 * (fahrenheit - 32) / 9);

        System.out.printf("%nFahrenheit: %.2f | Celsius: %.2f", fahrenheit, celsius);

    }
}
