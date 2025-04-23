package devdojo.association.exercise.test;

import devdojo.association.exercise.domain.*;

public class SeminarTest {
    public static void main(String[] args) {
        Local local1 = new Local("Centro de Convenções");
        Local local2 = new Local("Autódromo de Interlagos");

        Seminar seminar1 = new Seminar("Distopia dos Apoteóticos", local1);
        Seminar seminar2 = new Seminar("Em busca da verdade oculta", local2);

        Student stu1 = new Student("Guilherme M.", 22, seminar1);
        Student stu2 = new Student("Mauro Lopes", 18, seminar1);
        Student stu3 = new Student("Bruce Banner", 20, seminar2);
        Student stu4 = new Student("Tiago Leifert", 19, seminar2);

        Student[] students1 = new Student[]{stu1, stu2};
        Student[] students2 = new Student[]{stu3, stu4};

        seminar1.setStudents(students1);
        seminar2.setStudents(students2);

        Seminar[] seminars = {seminar1, seminar2};

        Professor professor = new Professor("Roberta Amorim", Specialization.LITERATURA, seminars);

        professor.print();

    }
}
