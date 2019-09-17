import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {

  public static void main(String[] args) {

    /* Create a list with the following items.
      Eggs, milk, fish, apples, bread and chicken */
    ArrayList<String> list = new ArrayList<>();
    list.addAll(new ArrayList<>(Arrays.asList("Eggs", "milk", "fish", "apples", "bread", "chicken")));

    // Do we have milk on the list?
    if (list.contains("milk")) {
      System.out.println("Yes, we have.");
    } else {
      System.out.println("No, we don't.");
    }

    // Do we have bananas on the list?
    if (list.contains("bananas")) {
      System.out.println("Yes, we have.");
    } else {
      System.out.println("No, we don't.");
    }
  }
}
