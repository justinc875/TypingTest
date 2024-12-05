/**
 * This class handles the user input and calculates all necessary statistics
 *
 * @author Alex Wang and Justin Chen
 */
public class TypeTest {
    /** The value obtained from timer in milliseconds */
    double timer;

    /** The randomly generated type test */
    String typeTest;

    /** The user input */
    String userInput;

    /** The number of right characters comparing user input with the type test */
    int rightCharacters;

    /** The number of wrong characters comparing user input with the type test */
    int wrongCharacters;

    /** accuracy of the user input when comparing to the type test */
    double accuracy;

    /**
     * Instantiates a TypeTest object
     *
     * @param timer The timer
     * @param typeTest The random type test
     * @param userInput The user input
     */
    public TypeTest(double timer, String typeTest, String userInput) {
        this.timer = timer;
        this.typeTest = typeTest;
        this.userInput = userInput; //redundant, need to utilize
        accuracy = 0;
        rightCharacters = 0;
        wrongCharacters = 0;
    }

    /**
     * Returns the raw WPM of the user
     * <p>
     * Calculates the raw WPM by obtaining the length of the user input string
     * then dividing the length by the average word length
     * then dividing the quotient by the number of seconds
     *
     * @return the rawWPM
     */
    public double rawWPM() {
        int length = userInput.length();
        return ((double) length / 5) / timer;
    }

    /**
     * Returns the WPM of the user
     * <p>
     * Calculates the WPM by calling the getCharacters method to obtain the right and wrong characters
     * Calls the rightCharacters variable and casts it into a double
     * Divides rightCharacters by 5
     * Divides the quotient by the number of seconds
     *
     * @return the WPM
     */
    public double wpm() {
        getCharacters();
        return ((double) rightCharacters / 5) / timer;
    }

    /**
     * Returns the accuracy of the user
     * <p>
     * Calculates the accuracy by calling the getCharacters method to obtain the right and wrong characters
     * Calls the rightCharacters variable and casts it into a double
     * finds total characters by adding the rightCharacters and wrongCharacters
     * divides the number of right characters by the total
     *
     * @return the accuracy
     */
    public double accuracy() {
        getCharacters();
        double accuracyCurrent = 100 * ((double) rightCharacters / (rightCharacters + wrongCharacters));
        return Math.round(accuracyCurrent * 100.0) / 100.0;
    }

    /**
     * Determines the number of right characters and wrong characters
     * <p>
     * The number of right and wrong characters are calculated by using a for loop
     * to iterate through each individual character of user input, checking
     * if the character at index i is equal to the character at index i
     * of the typeTest string
     * if they are equal then the character is considered right
     * otherwise it is considered wrong
     * updates the value of both instance variables
     */
    private void getCharacters() {
        for (int i = 0; i < userInput.length(); i++) {
            if (userInput.substring(i, i + 1).equals(typeTest.substring(i, i + 1))) {
                rightCharacters++;
            } else {
                wrongCharacters++;
            }
        }
    }

    public void printStats() {
        System.out.println("Good job!");
        System.out.println("The time you took to type was " + timer + "!");
        System.out.println("Your wpm is " + wpm());
        System.out.println("Your raw wpm is " + rawWPM());
        System.out.println("Your accuracy is " + accuracy() + "%");
        System.out.println("Thanks for typing with us!");
    }
}