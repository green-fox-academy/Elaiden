public class DrawChessTable {

  public static void main(String[] args) {

    for (int i = 1; i <= 8; i++) {
      for (int j = 1; j <= 8; j++) {
        if (i % 2 != 0 && j % 2 != 0) {
          System.out.print("%");
          System.out.print(" ");
        } else if (i % 2 == 0 && j % 2 == 0) {
          System.out.print(" ");
          System.out.print("%");
        }
      }
      System.out.println();
    }
  }
}
