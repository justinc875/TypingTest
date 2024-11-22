import java.util.Scanner;

public class TypeTestLogic {
    //instance variables
    private Scanner scan;
    private String info;

    //constructor
    public TypeTestLogic() {
        info = "";
        scan = new Scanner(System.in);
    }


    //game loop
    public void start() {
        System.out.println("Welcome to the TypingTest");
        getInfo();
    }

    //helper methods
    public void getInfo() {
        System.out.println("Which test would you want to take?");
        System.out.println("15 second test or 30 word test");
        info = scan.nextLine();

        //multiple if conditionals to load up whichever test user selects
        /* if (info == ) {

        }
        if (info == ) {

        } */

        mainMenuStart();
    }


}
