package kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameShould {
    @Test
    void return_0_when_miss()
    {
        var bowlingGame = new BowlingGame();
        var result = bowlingGame.score("-");

        assertEquals(0, result);
    }

    @Test
    void return_1_when_only_one_pin_thrown()
    {
        var bowlingGame = new BowlingGame();
        var result = bowlingGame.score("1");

        assertEquals(1, result);
    }

    @Test
    void return_2_when_only_two_pin_thrown()
    {
        var bowlingGame = new BowlingGame();
        var result = bowlingGame.score("2");

        assertEquals(2, result);
    }

    @Test
    void return_2_when_only_two_pin_thrown_with_two_tries()
    {
        var bowlingGame = new BowlingGame();
        var result = bowlingGame.score("2-");

        assertEquals(2, result);
    }

    @Test
    void return_3_when_only_three_pin_thrown_with_two_tries()
    {
        var bowlingGame = new BowlingGame();
        var result = bowlingGame.score("21");

        assertEquals(3, result);
    }

    @Test
    void return_90_for_the_given_line()
    {
        var bowlingGame = new BowlingGame();
        var result = bowlingGame.score("9-|9-|9-|9-|9-|9-|9-|9-|9-|9-||");

        assertEquals(90, result);
    }

    @Test
    void return_100_for_the_given_line()
    {
        var bowlingGame = new BowlingGame();
        var result = bowlingGame.score("9/|9-|9-|9-|9-|9-|9-|9-|9-|9-||");

        assertEquals(100, result);
    }

    @Test
    void return_110_for_the_given_line()
    {
        var bowlingGame = new BowlingGame();
        var result = bowlingGame.score("9/|9-|9/|9-|9-|9-|9-|9-|9-|9-||");

        assertEquals(110, result);
    }


    @Test
    void return_105_for_the_given_line()
    {
        var bowlingGame = new BowlingGame();
        var result = bowlingGame.score("9/|9-|9-|9-|9-|9-|9-|9-|9-|9/||4");

        assertEquals(105, result);
    }
}
