package devdojo.association.domain;

import java.util.Arrays;

public class Team {
    private String name;
    private String presidentName;
    private int yearFoundation;
    private Player[] players;

    public Team(String name, String presidentName, int yearFoundation) {
        this.name = name;
        this.presidentName = presidentName;
        this.yearFoundation = yearFoundation;
    }

    public Team(String name, String presidentName, int yearFoundation, Player[] players) {
        this.name = name;
        this.presidentName = presidentName;
        this.yearFoundation = yearFoundation;
        this.players = players;
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

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", presidentName='" + presidentName + '\'' +
                ", yearFoundation=" + yearFoundation +
                ", players=" + Arrays.toString(players) +
                '}';
    }
}
