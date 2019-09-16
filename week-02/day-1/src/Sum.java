import java.util.Scanner;

public class Sum {

  public static void main(String[] args) {

    // Write a function called `sum` that returns the sum of numbers from zero to the given parameter

    Scanner scanner = new Scanner(System.in);
    System.out.print("Add the end number: ");
    int countEnd = scanner.nextInt();
    int sum = sum(countEnd);
    System.out.println(sum);
  }

  public static int sum(int countTo) {
    int sumActual = 0;
    for (int i = 1; i <= countTo; i++) {
      sumActual += i;
    }
    return sumActual;
  }
}
