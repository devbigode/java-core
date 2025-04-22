package devdojo.association.unidirectional.test;

import devdojo.association.unidirectional.domain.Player;
import devdojo.association.unidirectional.domain.Team;

public class Players {
    public static void main(String[] args) {
        Team santos = new Team("Santos FC", "Marcelo Teixeira", 1912);
        Team barcelona = new Team("FC Barcelona", "Joan Laporta", 1899);

        Player player1 = new Player("Guilherme", "Forward", 26, santos);
        Player player2 = new Player("Neymar Jr", "Playmaker", 34, santos);
        Player player3 = new Player("Raphinha", "Striker", 27);
        player3.print();
        player3.setTeam(barcelona);

        Player[] players = {player1, player2, player3};

        for (Player player : players) {
            player.print();
        }

    }
}
