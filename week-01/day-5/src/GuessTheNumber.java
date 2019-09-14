import java.util.Scanner;

public class GuessTheNumber {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int mysteryNumber = 8;
    int userTry;
    System.out.print("Try to figure out the secret number, give me a number: ");

    do {
      userTry = input.nextInt();
      if (userTry > mysteryNumber) {
        System.out.println("The stored number is lower");
      } else if (userTry < mysteryNumber) {
        System.out.println("The stored number is higher");
      }
    } while (userTry != mysteryNumber);
    System.out.println("You found the number: " + mysteryNumber);
  }
}
