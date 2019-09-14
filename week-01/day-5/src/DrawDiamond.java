import java.util.Scanner;

public class DrawDiamond {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Add a number for the diamond: ");
    int lines = input.nextInt();
    int center = 1;
    int sideEmpty = lines / 2;

    for (int i = 0; i < lines; i++) {
      for (int j = 0; j < sideEmpty; j++) {
        System.out.print("0");
      }
      for (int k = 0; k < center; k++) {
        System.out.print("*");
      }
      System.out.println();
      if (i < lines / 2) {
        center += 2;
        sideEmpty--;
      } else {
        center -= 2;
        sideEmpty++;
      }
    }
  }
}
