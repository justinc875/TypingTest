import java.util.Objects;
import java.util.Scanner;

public class TypeTestLogic {
    //instance variables
    private Scanner scan;
    private String info;
    private String start;
    private String wordTest;
    private String userInput;
    private int milliseconds;

    //constructor
    public TypeTestLogic() {
        info = "";
        start = "";
        scan = new Scanner(System.in);
        wordTest = "";
        milliseconds = 0;
    }



    //game loop
    public void start() {
        System.out.println("Welcome to the TypingTest");
        started();
    }

    //getters and setters

    public String getStart() {
        return start;
    }

    public String getInfo() {
        return info;
    }

    //helper methods
    public void started() {
        System.out.print("Type in \"A\" for a 15 word test or \"B\" for a 30 word test: ");
        info = scan.nextLine();
        while (!(info.equals("A") || info.equals("B"))) {
            System.out.println("Please type in in the letter \"A\" for a 15 word test or the letter \"B\" for a 30 word test, please keep in mind the letters are case sensitive!");
            info = scan.nextLine();
        }
        mainMenuStart();
    }

    private void mainMenuStart() {
        System.out.println("Input any character to start your test: ");
        start = scan.nextLine();
        if (!(start.isEmpty())) {//intellij suggested to change this from .equals to .isEmpty
            startTimer();
            testObject();
            System.out.println("Good luck!");
            System.out.println("===============================================================");
            System.out.println(wordTest);
            System.out.println("===============================================================");
            userInput = scan.nextLine();
            if (!Objects.equals(userInput, "")) {
                TypeTest dynamiteType = new TypeTest(milliseconds , wordTest, userInput);
                dynamiteType.printStats();
            }
            //create an object to use for print stats
        }
    }

    private void testObject() {
        if (info.equals("A") || info.equals("B")) {
            WordList test = new WordList();
            test.generateLoop(info);
            test.generateWordTest();
            wordTest = test.getWordTest();
        }
    }

    private void startTimer() {
        //start the timer:
        Watch s = new Watch(this);
        Thread t = new Thread(s);
        t.start();
        milliseconds = s.getX();
    }

}