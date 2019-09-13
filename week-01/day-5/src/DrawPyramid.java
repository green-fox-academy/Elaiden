import java.util.Scanner;

public class DrawPyramid {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Add a number for the pyramid: ");
    int lines = input.nextInt();

    for (int i = 0; i < lines; i++) {
      for (int j = 0; j < lines - i; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k <= i * 2; k++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
