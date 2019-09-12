import java.util.Scanner;

public class MileToKmConverter {

    public static void main(String[] args) {

        Scanner mileScanner = new Scanner(System.in);
        System.out.println("Please give me a distance in miles (double format) to convert it to km!");
        double mile = mileScanner.nextDouble();
        double km = mile / 0.62137;
        System.out.println(mile + " miles equals to " + km + " km.");

    }
}
