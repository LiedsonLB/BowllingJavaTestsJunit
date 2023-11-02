package Testbowling;

import Testbowling.Exceptions.InvalidTurn;
import Testbowling.models.Game;
import Testbowling.models.Turn;

public class Main {
    public static void main(String[] args) throws InvalidTurn {
        Game g = new Game();

        // 1ª Rodada
        g.add(new Turn(5, 4));
        // 2ª Rodada
        g.add(new Turn(2, 6));
        // 3ª Rodada
        g.add(new Turn(7, 1));
        // 4ª Rodada
        g.add(new Turn(4, 3));
        // 5ª Rodada
        g.add(new Turn(5, 0));
        // 6ª Rodada
        g.add(new Turn(6, 2));
        // 7ª Rodada
        g.add(new Turn(8, 1));
        // 8ª Rodada
        g.add(new Turn(3, 4));
        // 9ª Rodada
        g.add(new Turn(2, 5));
        // 10ª Rodada
        g.add(new Turn(1, 2));
        
    }
}
