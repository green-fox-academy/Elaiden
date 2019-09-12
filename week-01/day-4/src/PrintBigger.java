import java.util.Scanner;

public class PrintBigger {

    public static void main(String[] args) {

        Scanner inputForCompare = new Scanner(System.in);

        System.out.println("Give me two integers and I'll tell you the bigger one. Please enter the first:");
        int a = inputForCompare.nextInt();
        System.out.println("And the second:");
        int b = inputForCompare.nextInt();

        if (a == b) {
            System.out.println("They are even.");
        } else if (a > b) {
            System.out.println(a + " is bigger");
        } else {
            System.out.println(b + " is bigger");
        }

    }
}
