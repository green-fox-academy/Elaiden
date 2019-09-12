import java.util.Scanner;

public class OneTwoALot {

    public static void main(String[] args) {

        Scanner numberScan = new Scanner(System.in);

        System.out.println("Please give me a number!");
        int number = numberScan.nextInt();

        if (number <= 0) {
            System.out.println("Not enough");
        } else if (number == 1) {
            System.out.println("One");
        } else if (number == 2) {
            System.out.println("Two");
        } else {
            System.out.println("A lot");
        }
    }
}
