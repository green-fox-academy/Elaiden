import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ProductDatabase {

  public static void main(String[] args) {

    /* Create a map with the following key-value pairs.

      Product name (key)	Price (value)
      Eggs	200
      Milk	200
      Fish	400
      Apples	150
      Bread	50
      Chicken	550 */
    HashMap<String, Integer> products = new HashMap<>();
    products.put("Eggs", 200);
    products.put("Milk", 200);
    products.put("Fish", 400);
    products.put("Apples", 150);
    products.put("Bread", 50);
    products.put("Chicken", 550);

    // How much is the fish?
    System.out.println("The fish is: " + products.get("Fish"));

    // What is the most expensive product?
    int highest = 0;
    for (Integer price : products.values()) {
      if (price > highest) {
        highest = price;
      }
    }
    System.out.println("Highest is: " + highest);

    // What is the average price?
    int sum = 0;
    for (Integer check : products.values()) {
      sum += check;
    }
    System.out.println("Average price is: " + sum / products.values().size());

    // How many products' price is below 300?
    int belowTarget = 0;
    for (Integer check : products.values()) {
      if (check < 300) {
        belowTarget++;
      }
    }
    System.out.println(belowTarget + " products are under 300");

    // Is there anything we can buy for exactly 125?
    if (products.containsValue(125)) {
      System.out.println("Yes, there is.");
    } else {
      System.out.println("No, there isn't.");
    }

    // What is the cheapest product?
    int cheapest = 5000;
    String product = "";
    for (Map.Entry<String, Integer> obj : products.entrySet()) {
      if (obj.getValue() < cheapest) {
        cheapest = obj.getValue();
        product = obj.getKey();
      }
    }
    System.out.println(product);
  }
}
