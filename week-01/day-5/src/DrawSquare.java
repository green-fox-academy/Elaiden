import java.util.Scanner;

public class DrawSquare {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Add the side of the square: ");
    int side = input.nextInt();
    int innerSpace = side - 2;

    for (int i = 0; i < side - innerSpace; i++) {
      for (int j = 0; j < side; j++) {
        System.out.print("%");
      }
      if (i > 0) {
        break;
      }
      System.out.println();
      for (int k = 0; k < innerSpace; k++) {
        System.out.print("%");
        for (int l = 0; l < innerSpace; l++) {
          System.out.print(" ");
        }
        System.out.println("%");
      }
    }
  }
}
