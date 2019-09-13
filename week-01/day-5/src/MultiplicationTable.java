import java.util.Scanner;

public class MultiplicationTable {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Please add a number for multiplication: ");
    double number = input.nextDouble();

    for (int i = 1; i <= 10; i++) {
      System.out.println(i + " * " + Math.round(number) + " = " + Math.round(i * number));
    }

  }
}
