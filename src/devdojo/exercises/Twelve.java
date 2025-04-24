package devdojo.exercises;

import java.util.Scanner;

public class Twelve {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o valor do produto: ");
        double price = input.nextDouble();

        System.out.println(" 1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto\n" +
                "\n" +
                " 2 - À Vista no cartão de crédito, recebe 10% de desconto\n" +
                "\n" +
                " 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros\n" +
                "\n" +
                " 4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%");

        System.out.print("Escolha uma opção de pagamento [1 a 4]: ");
        int choice = input.nextInt();
        double discount;

        switch (choice){
            case 1:
                discount = price - (price * 0.15);
                System.out.println("Preço a pagar: " + discount);
                break;
            case 2:
                discount = price - (price * 0.10);
                System.out.println("Preço a pagar: " + discount);
                break;
            case 3:
                System.out.println("Preço a pagar: " + price);
                break;
            case 4:
                discount = price + (price * 0.10);
                System.out.println("Preço a pagar: " + discount);
                break;
            default:
                System.out.println("Escolha uma opção válida.");
        }

    }
}
