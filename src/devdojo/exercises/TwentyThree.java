package devdojo.exercises;

import java.util.Scanner;

public class TwentyThree {

    public static void calculateSalary(double priceClass, int classTaught){
        double salary = priceClass * classTaught;

        if (salary < INSS.SALARY_TWO.getSalary()){
            double aliquot = INSS.SALARY_MINIMAL.getAliquot();
            double netSalary = salary - (salary * aliquot);
            System.out.printf("Salário líquido: %.2f - %.2f = %.2f", salary, (salary * aliquot), netSalary);

        } else if (salary >= INSS.SALARY_TWO.getSalary() && salary < INSS.SALARY_THREE.getSalary()) {
            double aliquot = INSS.SALARY_TWO.getAliquot();
            double netSalary = salary - (salary * aliquot);
            System.out.printf("Salário líquido: %.2f - %.2f = %.2f", salary, (salary * aliquot), netSalary);

        } else if (salary >= INSS.SALARY_THREE.getSalary() && salary < INSS.SALARY_FOUR.getSalary()) {
            double aliquot = INSS.SALARY_THREE.getAliquot();
            double netSalary = salary - (salary * aliquot);
            System.out.printf("Salário líquido: %.2f - %.2f = %.2f", salary, (salary * aliquot), netSalary);

        } else {
            double aliquot = INSS.SALARY_FOUR.getAliquot();
            double netSalary = salary - (salary * aliquot);
            System.out.printf("Salário líquido: %.2f - %.2f = %.2f", salary, (salary * aliquot), netSalary);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Informe o valor da hora aula e o número de aulas lecionadas no mês: ");
        double priceClass = input.nextDouble();
        int classTaught = input.nextInt();

        calculateSalary(priceClass, classTaught);
    }
}
