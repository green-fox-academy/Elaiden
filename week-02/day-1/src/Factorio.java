import java.util.Scanner;

public class Factorio {

  public static void main(String[] args) {

    // - Create a function called `factorio`
    //   that returns it's input's factorial

    Scanner scanner = new Scanner(System.in);
    System.out.print("Add the number to calculate it's factorial: ");
    double baseNumber = scanner.nextInt();

    double factorialOfBase = factorio(baseNumber);
    System.out.println(factorialOfBase);

  }

  public static double factorio(double number) {
    double factorioBase = 1;
    for (int i = 1; i <= number; i++) {
      factorioBase *= i;
    }
    return Math.round(factorioBase);
  }
}
