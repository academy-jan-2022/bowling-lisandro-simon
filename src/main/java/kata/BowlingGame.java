package kata;

public class BowlingGame {
    public int score(String line) {
        if(line != "-"){
            return Integer.parseInt(line);
        }

        return 0;
    }
}
