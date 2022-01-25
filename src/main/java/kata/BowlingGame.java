package kata;

public class BowlingGame {
    public int score(String line) {
        int finalScore = 0;

        for(var i = 0; i < line.length(); i++){
            if(line.charAt(i) != '-' && line.charAt(i) != '|') finalScore += Character.getNumericValue(line.charAt(i));
        }

        return finalScore;
    }
}
