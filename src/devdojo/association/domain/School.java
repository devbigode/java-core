package devdojo.association.domain;

import java.util.Arrays;

/* Relacionamento de muitos para um */

public class School {
    private String name;
    private String director;
    private Student[] students;

    public School(String name, String director) {
        this.name = name;
        this.director = director;
    }

    public School(String name, String director, Student[] students) {
        this.name = name;
        this.director = director;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", director='" + director + '\'' +
                ", students=" + Arrays.toString(students) +
                '}';
    }
}
