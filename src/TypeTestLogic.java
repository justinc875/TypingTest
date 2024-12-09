import java.util.Objects;
import java.util.Scanner;

public class TypeTestLogic {
    //instance variables
    private Scanner scan;
    private String info;
    private String start;
    private String wordTest;
    private String userInput;
    private double seconds;
    private Watch s;
    private Thread t;

    //constructor
    public TypeTestLogic() {
        info = "";
        start = "";
        scan = new Scanner(System.in);
        s = new Watch(this);
        t = new Thread(s);
        wordTest = "";
        seconds = 0;
    }



    //game loop
    public void start() {
        System.out.println("===============================================================");
        System.out.println("Welcome to the TypingTest");
        System.out.println("===============================================================");
        started();
    }

    //getters and setters

    public String getStart() {
        return start;
    }

    public String getInfo() {
        return info;
    }

    public double getSeconds() {
        return seconds;
    }

    public String getUserInput() {
        return userInput;
    }

    public String getWordTest() {
        return wordTest;
    }

    //helper methods
    public void started() {
        System.out.print("Type in \"A\" for a 15 word test or \"B\" for a 30 word test: ");
        info = scan.nextLine();
        while (!(info.equals("A") || info.equals("B"))) {
            System.out.println("Please type in in the letter \"A\" for a 15 word test or the letter \"B\" for a 30 word test, please keep in mind the letters are case sensitive!");
            info = scan.nextLine();
        }
        System.out.println("===============================================================");
        mainMenuStart();
    }

    private void mainMenuStart() {
        System.out.println("Input any character to start your test: ");
        start = scan.nextLine();
        if (!(start.isEmpty())) {//intellij suggested to change this from .equals to .isEmpty
            t.start();
            s.startSequence();
            testObject();

            System.out.println("Good luck!");
            System.out.println("===============================================================");
            System.out.println(wordTest);
            System.out.println("===============================================================");

            userInput = scan.nextLine();
            s.stopSequence();

            seconds = s.getX();

            //create an object to use for print stats
            if (!Objects.equals(userInput, "")) {
                TypeTest dynamiteType = new TypeTest(seconds , wordTest, userInput);
                dynamiteType.printStats();
            }

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


}