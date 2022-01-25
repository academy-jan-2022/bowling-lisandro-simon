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

    @Test
    void  return_1_when_only_one_pin_thrown()
    {
        var bowlingGame = new BowlingGame();
        var result = bowlingGame.score("1");

        assertEquals(1, result);
    }

    @Test
    void  return_2_when_only_two_pin_thrown()
    {
        var bowlingGame = new BowlingGame();
        var result = bowlingGame.score("2");

        assertEquals(2, result);
    }

    @Test
    void  return_2_when_only_two_pin_thrown_with_two_tries()
    {
        var bowlingGame = new BowlingGame();
        var result = bowlingGame.score("2-");

        assertEquals(2, result);
    }
}
