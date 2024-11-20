public class TypeTest {
    //instance variables
    double timer;
    String typeTest;
    String userInput;


    //constructor
    public TypeTest(double timer, String typeTest) {
        this.timer = timer;
        this.typeTest = typeTest;
        this.userInput = userInput;
    }


    //public classes


    //calculate wpm
    public double wpm() {
        return 0.0;
    }

    //calculate accuracy
    public double accuracy() {
        int wrongCharacters = 0;
        int rightCharacters = 0;
        for(int i = 0; i < userInput.length(); i++) {
            if (userInput.substring(i, i + 1).equals(typeTest.substring(i, i + 1))) {
                rightCharacters++;
            } else {
                wrongCharacters ++;
            }
        }
        double sum = rightCharacters + wrongCharacters;
        return rightCharacters/sum;
    }

    //calculate raw wpm
    public double rawWPM() {

        return 0.0;
    }

    //private helper classes



}

