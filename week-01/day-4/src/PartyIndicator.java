import java.util.Scanner;

public class PartyIndicator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("There is a party tonight, how many people are attending?");
        System.out.print("Girls: ");
        int girls = input.nextInt();
        System.out.print("Boys: ");
        int boys = input.nextInt();
        int guests = girls + boys;

        if (girls == 0) {
            System.out.println("Sausage party");
        } else if (guests < 20) {
            System.out.println("Average party...");
        } else if (girls != boys) {
            System.out.println("Quite cool party!");
        } else {
            System.out.println("The party is excellent!");
        }
    }
}
