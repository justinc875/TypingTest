public class TypeTest {
    //instance variables
    double timer;
    String typeTest;
    String userInput;
    int rightCharacters;
    int wrongCharacters;
    double accuracy;

    //constructor
    public TypeTest(double timer, String typeTest) {
        this.timer = timer;
        this.typeTest = typeTest;
        this.userInput = userInput;
        accuracy = 0;
        rightCharacters = 0;
        wrongCharacters = 0;
    }

    //getters and setters;

    //calculate raw wpm
    public double rawWPM() {
        int length = userInput.length();
         return ((double) length / 5) / timer;
    }

    //calculate wpm
    public double wpm() {
        getCharacters();
        return (rightCharacters / 5) / timer;
    }

    public double accuracy() {
        getCharacters();
        return (double) rightCharacters / (rightCharacters + wrongCharacters);
    }


    //private helper classes
    private void getCharacters() {
        int wrongCharacters = 0;
        int rightCharacters = 0;
        for(int i = 0; i < userInput.length(); i++) {
            if (userInput.substring(i, i + 1).equals(typeTest.substring(i, i + 1))) {
                rightCharacters++;
            } else {
                wrongCharacters ++;
            }
        }
    }


}

