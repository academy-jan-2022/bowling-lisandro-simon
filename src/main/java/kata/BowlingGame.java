package kata;

public class BowlingGame {
    public int score(String line) {
        int finalScore = 0;
        int bonusScore = 0;
        boolean isSpare = false;
        int pipesCounter = 0;

        for(var i = 0; i < line.length(); i++){
            var currentChar = line.charAt(i);
            if(!isASimbol(currentChar)){
                finalScore += Character.getNumericValue(currentChar);
                if (pipesCounter< 2){
                    bonusScore = isSpare ? bonusScore + Character.getNumericValue(currentChar) : bonusScore;
                    pipesCounter = 0;
                }
                isSpare = false;
            }
            if (currentChar == '|') pipesCounter ++;
            if(currentChar == '/'){
                finalScore += pinsDroppedInSpare(line, i);
                isSpare = true;
            }
        }

        return finalScore + bonusScore;
    }

    private int pinsDroppedInSpare(String line, int i) {
        return 10 - Character.getNumericValue(line.charAt(i - 1));
    }

    private boolean isASimbol(char symbol) {
        return symbol == '-'
            || symbol == '|'
            || symbol == '/';
    }
}
