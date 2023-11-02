package Testbowling.Test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import Testbowling.models.Game;
import Testbowling.models.Turn;

public class ValidSpecialPlay {
    Game g = new Game();
    @ParameterizedTest
    @CsvSource({"10, 0"})
    public void isStrikeTest(int a, int b) {
        assertEquals(new Turn(a, b).isStrike(), true);
    }

    @ParameterizedTest
    @CsvSource({"0, 10", "1, 9", "2, 8", "3, 7", "4, 6", "5, 5", "6, 4", "7, 3", "8, 2", "9, 1"})
    public void isSpireTest(int a, int b) {
        assertEquals(new Turn(a, b).isSpare(), true);
    }

    @ParameterizedTest
    @CsvSource({"10,0"})
    public void isNotSpireIsStrikeTest(int a, int b) {
        assertEquals(new Turn(a, b).isSpare(), false);
    }
}
