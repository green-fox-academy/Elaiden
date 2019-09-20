import java.util.HashMap;
import java.util.Map;

public class ProductsDatabase2 {

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

    // Which products cost less than 201? (just the name)
    int priceCheck = 201;
    for (Map.Entry<String, Integer> obj : products.entrySet()) {
      if (obj.getValue() < priceCheck) {
        System.out.println(obj.getKey() + " is cheaper than 201.");
      }
    }
    System.out.println("*****************************************");
    // Which products cost more than 150? (name + price)
    priceCheck = 150;
    for (Map.Entry<String, Integer> obj : products.entrySet()) {
      if (obj.getValue() > priceCheck) {
        System.out.println(obj.getKey() + " costs " + obj.getValue());
      }
    }

  }
}
