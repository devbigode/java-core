package devdojo.association.unidirectional.test;

import devdojo.association.unidirectional.domain.School;
import devdojo.association.unidirectional.domain.Student;

public class Students {
    public static void main(String[] args) {
        Student stu1 = new Student("Guilherme Morais", 10523965L, "A3");
        Student stu2 = new Student("Gisele Silva", 59077925L, "A3");
        Student stu3 = new Student("Robert Storm", 88965743L, "B4");
        Student stu4 = new Student("Luisa Amorim", 56414777L, "D7");
        Student[] students = {stu1, stu2, stu3, stu4};

        School school = new School("Mãe Joana", "Paula Pacheco", students);
        System.out.println(school);

    }
}
