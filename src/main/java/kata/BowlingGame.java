package kata;

public class BowlingGame {
    public int score(String line) {
        int finalScore = 0;
        int bonusScore = 0;
        boolean isSpare = false;

        for(var i = 0; i < line.length(); i++){
            var currentChar = line.charAt(i);
            if(!isASimbol(line.charAt(i))){
                finalScore += Character.getNumericValue(line.charAt(i));
                bonusScore = isSpare ? bonusScore + Character.getNumericValue(line.charAt(i)) : bonusScore;
                isSpare = false;
            }

            if(currentChar == '/'){
                finalScore += (10 - Character.getNumericValue(line.charAt(i-1)));
                isSpare = true;
            }
        }

        return finalScore + bonusScore;
    }

    private boolean isASimbol(char symbol) {
        return symbol == '-'
            || symbol == '|'
            || symbol == '/';
    }
}
