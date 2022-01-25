package kata;

public class BowlingGame {
    public int score(String line) {
        int finalScore = 0;

        for(var i = 0; i < line.length(); i++){
            if(!isASimbol(line.charAt(i)))
                finalScore += Character.getNumericValue(line.charAt(i));
        }

        return finalScore;
    }

    private boolean isASimbol(char symbol) {
        return symbol == '-'
            || symbol == '|';
    }
}
