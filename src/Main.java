import java.util.Scanner;
import java.util.Timer;

public class Main {
    public static void main(String[] args) {
        Stuff s = new Stuff();
        Thread t = new Thread(s);
        t.start();
        System.out.println("look here!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String n = scanner.nextLine();
        System.out.println(n);
        System.out.println(s.getX());

    }
}
