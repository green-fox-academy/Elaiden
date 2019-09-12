import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {

        Scanner numberScan = new Scanner(System.in);

        System.out.println("Please give me a number (integer), so I can tell if it's even or odd.");
        int number = numberScan.nextInt();
        if (number == 0 || (number % 2 == 0)) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
