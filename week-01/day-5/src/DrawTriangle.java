import java.util.Scanner;

public class DrawTriangle {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Add a number for the triangle: ");
    int lines = input.nextInt();

    for (int i = 0; i < lines; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
