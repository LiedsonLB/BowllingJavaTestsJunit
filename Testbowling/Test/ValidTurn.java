package Testbowling.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import Testbowling.Exceptions.InvalidTurn;
import Testbowling.models.Game;
import Testbowling.models.Turn;

public class ValidTurn {
    Game g = new Game();

    @ParameterizedTest
    @CsvSource({"10, 1","11, 1","13, 6","6, 5","7, 8","19, 0","8, 8","7, 7"}) // entre outros varios casos
    public void invalidTurn(int a, int b) throws InvalidTurn{
        assertThrows(InvalidTurn.class, () -> {
			g.add(new Turn(a, b));
		});
    }
}
