import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Watch s = new Watch();
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
