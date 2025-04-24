package devdojo.exercises;

public enum INSS {
    SALARY_MINIMAL(1518, 0.075),
    SALARY_TWO(2793.88, 0.09),
    SALARY_THREE(4190.83, 0.12),
    SALARY_FOUR(8157.41, 0.14);

    private double salary;
    private double aliquot;

    INSS(double salary, double aliquot) {
        this.salary = salary;
        this.aliquot = aliquot;
    }

    public double getSalary() {
        return salary;
    }

    public double getAliquot() {
        return aliquot;
    }
}
