import java.util.Scanner;

public class TypeTestLogic {
    //instance variables
    private Scanner scan;
    private String info;
    private String start;

    //constructor
    public TypeTestLogic() {
        info = "";
        start = "";
        scan = new Scanner(System.in);
    }

    //game loop
    public void start() {
        System.out.println("Welcome to the TypingTest");
        getInfo();
        Watch s = new Watch(this);
        Thread t = new Thread(s);
        t.start();
        System.out.println(s.getX());
    }

    //getters and setters

    public String getStart() {
        return start;
    }

    //helper methods
    public void getInfo() {
        System.out.println("Which test would you want to take?");
        System.out.print("15 second test or 30 word test");
        info = scan.nextLine();

        //multiple if conditionals to load up whichever test user selects
        /* if (info == ) {

        }
        if (info == ) {

        } */

        mainMenuStart();
    }

    //helper method
    private void mainMenuStart() {
        System.out.println("Input any character to start your test: ");
        start = scan.nextLine();
    }

    public void printStats() {
        System.out.println("printstats");
    }


}
