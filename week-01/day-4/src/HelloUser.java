import java.util.Scanner;

public class HelloUser {

    public static void main(String[] args) {

        Scanner nameScanner = new Scanner(System.in);
        System.out.println("Please give your name!");
        String name = nameScanner.next();
    }
}
