package devdojo.exercises;

public class Eighteen {
    public static void main(String[] args) {
        double firstHeight = 1.5;
        double secondHeight = 1.1;

        int year = 0;

        while (firstHeight > secondHeight){
            secondHeight += 0.03;
            firstHeight += 0.02;
            System.out.println(firstHeight + " | " + secondHeight);
            year++;
        }

        System.out.printf("Durante %d anos Franscisco foi maior que Sara.", year);

    }
}
