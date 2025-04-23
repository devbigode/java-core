## Aulas 64 a 66 - Associação unidirecional

### 1. Exemplo um para muitos:

~~~
public class Player {
    private String name;
    private String position;
    private int age;

    /* Muitos jogadores têm apenas um clube */
    private Team team;
    
    ...
    
}
~~~

#### Os jogadores podem compartilhar do mesmo clube/time, mas só poderão ter apenas um. Ao contrário de um clube, que pode ter muitos jogadores associados a ele.

### 2. Exemplo muitos para um:

~~~
public class School {
    private String name;
    private String director;
    private Student[] students;

    ...
    
    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", director='" + director + '\'' +
                ", students=" + Arrays.toString(students) +
                '}';
    }
    
}
~~~

#### Uma escola pode ter múltiplos alunos associados a ela, mas um estudante só pode estar matriculado em uma escola.
