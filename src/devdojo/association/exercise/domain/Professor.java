package devdojo.association.exercise.domain;

import java.util.Arrays;

public class Professor {
    private String name;
    private Specialization specialization;
    private Seminar[] seminars;

    public Professor(String name, Specialization specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public Professor(String name, Specialization specialization, Seminar[] seminars) {
        this.name = name;
        this.specialization = specialization;
        this.seminars = seminars;
    }

    public void print(){
        System.out.println("Professor(a): " + this.name
                            + " | Especialização: " + this.specialization);
        for (Seminar seminar : seminars) {
            System.out.println("\nSeminário: " + seminar.getTitle()
                    + " | Local do evento: " + seminar.getLocal().getAddress());

            for (Student student : seminar.getStudents()) {
                System.out.println("Aluno(a): " + student.getName()
                        + " | Idade: " + student.getAge());
            }

        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Specialization getSpecialization() {
        return specialization;
    }

    public void setSpecialization(Specialization specialization) {
        this.specialization = specialization;
    }

    public Seminar[] getSeminars() {
        return seminars;
    }

    public void setSeminars(Seminar[] seminars) {
        this.seminars = seminars;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "name='" + name + '\'' +
                ", specialization=" + specialization +
                ", seminars=" + Arrays.toString(seminars) +
                '}';
    }
}
