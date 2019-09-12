import java.util.Scanner;

public class AnimalsAndLegs {

    public static void main(String[] args) {

        Scanner counter = new Scanner(System.in);

        System.out.println("Please give me the amount of chickens the farmer has!");
        int amountChicken = counter.nextInt();
        int chickenLegs = amountChicken * 2;
        System.out.println("Please give me the amount of pigs the farmer has!");
        int amountPigs = counter.nextInt();
        int pigLegs = amountPigs * 4;
        int totalLegs = chickenLegs + pigLegs;
        System.out.println("The " + amountChicken + " chicken(s) and the " + amountPigs + " pig(s) have " + totalLegs + " legs.");

    }
}
