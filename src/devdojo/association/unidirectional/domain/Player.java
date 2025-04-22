package devdojo.association.unidirectional.domain;

/* Associação um para muitos */

public class Player {
    private String name;
    private String position;
    private int age;

    /* Muitos jogadores, têm apenas um clube */
    private Team team;

    public Player(String name, String position, int age) {
        this.name = name;
        this.position = position;
        this.age = age;
    }

    public Player(String name, String position, int age, Team team) {
        this.name = name;
        this.position = position;
        this.age = age;
        this.team = team;
    }

    public void print(){
        if (team != null) {
            System.out.println(
                    "{\nname: " + this.name + ",\n"
                            + "position: " + this.position + ",\n"
                            + "age: " + this.age + ",\n"
                            + "team: " + team
                            + "\n}\n");
        } else {
            System.out.println(
                    "{\nname: " + this.name + ",\n"
                            + "position: " + this.position + ",\n"
                            + "age: " + this.age
                            + "\n}\n");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
