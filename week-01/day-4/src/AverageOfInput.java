import java.util.Scanner;

public class AverageOfInput {

    public static void main(String[] args) {

        Scanner numbers = new Scanner(System.in);

        System.out.println("Please give me 5 integers to calculate their sum and average!");

        System.out.print("1st number: ");
        int numberFirst = numbers.nextInt();
        System.out.print("2nd number: ");
        int numberSecond = numbers.nextInt();
        System.out.print("3rd number: ");
        int numberThird = numbers.nextInt();
        System.out.print("4th number: ");
        int numberFourth = numbers.nextInt();
        System.out.print("5th number: ");
        int numberFifth = numbers.nextInt();
        int sum = numberFirst + numberSecond + numberThird + numberFourth + numberFifth;
        double avg = (double) sum / 5;

        System.out.println("Sum: " + sum + ", Average: " + avg);

    }
}
