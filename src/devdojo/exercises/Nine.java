package devdojo.exercises;

import java.util.Scanner;

public class Nine {

    public static void imc(double w, double h){
        double result = w / (Math.pow(h, 2));

        if (result < 0) return;

        if (result <= 18.5){
            System.out.println(IMC.Abaixo_do_peso);
        } else if (result >= 18.6 && result < 25) {
            System.out.println(IMC.Peso_ideal + " (" + IMC.Peso_ideal.getDescription() + ")");
        } else if (result >= 25 && result < 30) {
            System.out.println(IMC.Levemente_acima_do_peso);
        } else if (result >= 30 && result < 35) {
            System.out.println(IMC.Obesidade_grau_I);
        } else if (result >= 35 && result < 40) {
            System.out.println(IMC.Obesidade_grau_II + " (" + IMC.Obesidade_grau_II.getDescription() + ")");
        } else{
            System.out.println(IMC.Obesidade_grau_III + " (" + IMC.Obesidade_grau_III.getDescription() + ")");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o seu peso e altura atuais: ");
        double weight = input.nextDouble();
        double height = input.nextDouble();

        imc(weight, height);
    }
}
