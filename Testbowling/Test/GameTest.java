package Testbowling.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Testbowling.Exceptions.InvalidTurn;
import Testbowling.models.Game;
import Testbowling.models.Turn;

public class GameTest {

    @Test
    public void StrikeInGame() throws InvalidTurn{
        Game g = new Game();
        
        // partida perfeita com strike nas 10 rodadas

        // 1ª Rodada
        g.add(new Turn(10, 0));
        // 2ª Rodada
        g.add(new Turn(10, 0));
        // 3ª Rodada
        g.add(new Turn(10, 0));
        // 4ª Rodada
        g.add(new Turn(10, 0));
        // 5ª Rodada
        g.add(new Turn(10, 0));
        // 6ª Rodada
        g.add(new Turn(10, 0));
        // 7ª Rodada
        g.add(new Turn(10, 0));
        // 8ª Rodada
        g.add(new Turn(10, 0));
        // 9ª Rodada
        g.add(new Turn(10, 0));
        // 10ª Rodada
        g.add(new Turn(10, 0));

        assertEquals(g.getResultScoreBoard(), 300);
    }

    @Test
    public void SpareInGame1() throws InvalidTurn{
        Game g = new Game();
        
        // partida com spare nas 10 rodadas

        // 1ª Rodada
        g.add(new Turn(5, 5));
        // 2ª Rodada
        g.add(new Turn(5, 5));
        // 3ª Rodada
        g.add(new Turn(5, 5));
        // 4ª Rodada
        g.add(new Turn(5, 5));
        // 5ª Rodada
        g.add(new Turn(5, 5));
        // 6ª Rodada
        g.add(new Turn(5, 5));
        // 7ª Rodada
        g.add(new Turn(5, 5));
        // 8ª Rodada
        g.add(new Turn(5, 5));
        // 9ª Rodada
        g.add(new Turn(5, 5));
        // 10ª Rodada
        g.add(new Turn(5, 5));

        assertEquals(g.getResultScoreBoard(), 150);
    }

    @Test
    public void NormalPlayInGame() throws InvalidTurn{
        Game g = new Game();

        // Jogada normal em uma partida, sem bônus de jogada
        
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

        assertEquals(g.getResultScoreBoard(), 71);
    }

    @Test
    public void SpareInGame2() throws InvalidTurn{
        Game g = new Game();
        
        // partida com spares e strikes 10 rodadas
        // 1ª Rodada: Strike (10 pontos)
        g.add(new Turn(10, 0));

        // 2ª Rodada: Spare (10 pontos)
        g.add(new Turn(5, 5));

        // 3ª Rodada: Strike (10 pontos)
        g.add(new Turn(10, 0));

        // 4ª Rodada: Spare (10 pontos)
        g.add(new Turn(6, 4));

        // 5ª Rodada: Strike (10 pontos)
        g.add(new Turn(10, 0));

        // 6ª Rodada: Spare (10 pontos)
        g.add(new Turn(3, 7));

        // 7ª Rodada: Strike (10 pontos)
        g.add(new Turn(10, 0));

        // 8ª Rodada: Spare (10 pontos)
        g.add(new Turn(8, 2));

        // 9ª Rodada: Strike (10 pontos)
        g.add(new Turn(10, 0));

        // 10ª Rodada: Strike (10 pontos) e um arremesso extra (5 pontos)
        g.add(new Turn(10, 5));

        assertEquals(g.getResultScoreBoard(), 215);
    }
}
