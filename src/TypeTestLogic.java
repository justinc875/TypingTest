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
        System.out.println("type something: ");
        info = scan.nextLine();
        Watch s = new Watch();
        Thread t = new Thread(s);
        t.start();
    }


}
