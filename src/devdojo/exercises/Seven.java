package devdojo.exercises;

import java.util.List;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Boolean> booleans = new ArrayList<>();

        while (booleans.size() != 2) {
            System.out.print("Digite true ou false: ");

            try {
                Boolean bool = input.nextBoolean();
                if (bool.equals(true) || bool.equals(false)){
                    booleans.add(bool);
                }
            } catch (InputMismatchException ime){
                throw new RuntimeException("Informe apenas valores booleanos.");
            }

        }

        if (booleans.get(0) && booleans.get(1)){
            System.out.println("Ambos os valores são verdadeiros.");
        } else if (booleans.get(0) || booleans.get(1)){
            System.out.println("Um dos valores é verdadeiro.");
        } else {
            System.out.println("Os valores são falsos.");
            }
    }
}
