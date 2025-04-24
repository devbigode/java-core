package devdojo.exercises;

import java.util.Calendar;
import java.util.Scanner;

public class Fifteen {

    public static void timeLived(int year){
        Calendar calendar = Calendar.getInstance();

        int calcYear = calendar.get(Calendar.YEAR) - year;
        int calcMonth = 12 - (calendar.get(Calendar.MONTH) + 1);
        int calcDay = 30 - calendar.get(Calendar.DAY_OF_MONTH);

        System.out.println("\nDia atual: "+ calendar.get(Calendar.DAY_OF_MONTH) + "/"
            + (calendar.get(Calendar.MONTH) + 1) + "/"
            + calendar.get(Calendar.YEAR) + "\n");

        System.out.printf("%d anos, %d meses e %d dias de vida", calcYear, calcMonth, calcDay);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Em que você nasceu? ");
        int year = input.nextInt();

        timeLived(year);

    }
}
