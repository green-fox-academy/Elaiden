import java.util.ArrayList;

public class PersonalFinance {

  public static void main(String[] args) {

    /* Create a list with the following items.
      500, 1000, 1250, 175, 800 and 120 */
    ArrayList<Integer> money = new ArrayList<>();
    money.add(500);
    money.add(1000);
    money.add(1250);
    money.add(175);
    money.add(800);
    money.add(120);

    // How much did we spend?
    int sum = 0;
    for (int check : money) {
      sum += check;
    }
    System.out.println("All spending is " + sum);

    // Which was our greatest expense?
    int biggest = 0;
    for (int check : money) {
      if (check > biggest) {
        biggest = check;
      }
    }
    System.out.println("The greatest expense was: " + biggest);

    // Which was our cheapest spending?
    int small = 5000;
    for (int check : money) {
      if (check < small) {
        small = check;
      }
    }
    System.out.println("Cheapest spending was: " + small);

    // What was the average amount of our spendings?
    sum = 0;
    for (int check : money) {
      sum += check;
    }
    int avg = sum / money.size();
    System.out.println("The average amount was: " + avg);
  }
}
