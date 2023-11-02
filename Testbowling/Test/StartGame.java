package Testbowling.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import Testbowling.models.Game;

public class StartGame {
    Game g = new Game();

    @Test
    public void startgameTest(){

        boolean initGameScore = g.isEmpty();

        assertTrue(initGameScore);
    }

    @Test
    public void startScoreNull(){
        int resul = g.getResultScoreBoard();
        assertEquals(resul, 0);
    }

    @Test
    public void startRoudNull(){
        int resul = g.getRoudCurr();
        assertEquals(resul, 0);
    }
}
