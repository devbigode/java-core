package devdojo.exercises;

import java.util.Scanner;

public class TwentyFour {

    public static final int KM_PER_LITER = 12;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o tempo gasto na viagem (em horas): ");
        int time = input.nextInt();

        System.out.print("Informe a velocidade média durante o percurso (em km/h): ");
        int km = input.nextInt();

        int distance = time * km;
        int liter = distance / KM_PER_LITER;

        System.out.printf("Ao longo de toda a viagem, o veículo gastou cerca de %d litro(s) de combustível.", liter);

        input.close();
    }
}
