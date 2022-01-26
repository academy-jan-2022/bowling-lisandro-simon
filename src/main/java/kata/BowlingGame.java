package kata;

public class BowlingGame {
    public int score(String line) {
        int finalScore = 0;
        boolean isSpare = false;
        int pipesCounter = 0;


        for(var i = 0; i < line.length(); i++){
            var currentThrow = line.charAt(i);

            if(!isASymbol(currentThrow)){
                finalScore += Character.getNumericValue(currentThrow);
                if (isRegularFrame(pipesCounter)){
                    finalScore = isSpare ? finalScore + Character.getNumericValue(currentThrow) : finalScore;
                    pipesCounter = 0;
                }
                isSpare = false;
            }

            if (currentThrow == '|') pipesCounter ++;

            if(currentThrow == '/'){
                finalScore += pinsDroppedInSpare(line, i);
                isSpare = true;
            }

            if(currentThrow == 'X'){
                finalScore += 10;
                finalScore += (Character.getNumericValue(line.charAt(i + 2)) + Character.getNumericValue(line.charAt(i +3)));
            }
        }

        return finalScore;
    }

    private boolean isRegularFrame(int pipesCounter) {
        return pipesCounter < 2;
    }

    private int pinsDroppedInSpare(String line, int i) {
        return 10 - Character.getNumericValue(line.charAt(i - 1));
    }

    private boolean isASymbol(char symbol) {
        return symbol == '-'
            || symbol == '|'
            || symbol == '/'
        || symbol == 'X';
    }
}
