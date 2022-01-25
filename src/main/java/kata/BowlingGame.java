package kata;

public class BowlingGame {
    public int score(String line) {
        for(var i = 0; i < line.length(); i++){
            if(line.charAt(i) != '-') return Character.getNumericValue(line.charAt(i));
        }
        return 0;
    }
}
