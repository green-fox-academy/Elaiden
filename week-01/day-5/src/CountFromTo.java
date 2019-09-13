import java.util.Scanner;

public class CountFromTo {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Please give 2 number to count:");
    int a = input.nextInt();
    int b = input.nextInt();

    if (b <= a) {
      System.out.println("The second number should be bigger!");
    } else {
      for (int i = a; i <= b; i++) {
        System.out.println(i);
      }
    }

  }
}
