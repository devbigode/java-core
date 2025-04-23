package devdojo.association.test;

import devdojo.association.domain.Player;
import devdojo.association.domain.Team;

public class Players {
    public static void main(String[] args) {
        /* Relação unidirecional */
        Team santos = new Team("Santos FC", "Marcelo Teixeira", 1912);
        Team barcelona = new Team("FC Barcelona", "Joan Laporta", 1899);

        Player player1 = new Player("Guilherme", "Forward", 26, santos);
        Player player2 = new Player("Neymar Jr", "Playmaker", 34, santos);
        Player player3 = new Player("Raphinha", "Striker", 27, barcelona);

        Player[] players = {player1, player2, player3};

        /* Relação bidirecional */
        Team g3x = new Team("G3X", "Gaules e K9", 2023);

        for (Player player : players) {
            player.print();

            /* Após a exibição, o time do jogador é mudado */
            player.setTeam(g3x);
        }

        g3x.setPlayers(players);
        System.out.println(g3x);

    }
}
