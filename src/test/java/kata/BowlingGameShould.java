package kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameShould {
    @Test
    void  return_0_when_miss()
    {
        var bowlingGame = new BowlingGame();
        var result = bowlingGame.score("-");
      assertEquals(0, result);
    }
}
