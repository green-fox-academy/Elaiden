import java.util.Scanner;

public class ParametricAverage {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.print("Add the amount of integers you wanna work with: ");
    int amount = input.nextInt();
    int sum = 0;

    System.out.println("Please add the " + amount + " integers: ");

    for (int i = 0; i < amount; i++) {
      int numbersToWork = input.nextInt();
      sum += numbersToWork;
    }
    System.out.println("Sum: " + sum + ", Average: " + (double) sum / (double) amount);
  }
}
