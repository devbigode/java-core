package devdojo.association.unidirectional.domain;

public class Team {
    private String name;
    private String presidentName;
    private int yearFoundation;

    public Team(String name, String presidentName, int yearFoundation) {
        this.name = name;
        this.presidentName = presidentName;
        this.yearFoundation = yearFoundation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPresidentName() {
        return presidentName;
    }

    public void setPresidentName(String presidentName) {
        this.presidentName = presidentName;
    }

    public int getYearFoundation() {
        return yearFoundation;
    }

    public void setYearFoundation(int yearFoundation) {
        this.yearFoundation = yearFoundation;
    }

    @Override
    public String toString() {
        return "{" +
                "name:'" + name + '\'' +
                ", presidentName:'" + presidentName + '\'' +
                ", yearFoundation:'" + yearFoundation +
                '}';
    }
}
