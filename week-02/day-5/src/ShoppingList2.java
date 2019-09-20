import java.util.HashMap;
import java.util.Map;

public class ShoppingList2 {

  public static void main(String[] args) {

    /* Represent the following products with their prices

      Product	Amount
      Milk	1.07
      Rice	1.59
      Eggs	3.14
      Cheese	12.60
      Chicken Breasts	9.40
      Apples	2.31
      Tomato	2.58
      Potato	1.75
      Onion	1.10 */
    HashMap<String, Double> products = new HashMap<>();
    products.put("Milk", 1.07);
    products.put("Rice", 1.59);
    products.put("Eggs", 3.14);
    products.put("Cheese", 12.60);
    products.put("Chicken Breasts", 9.40);
    products.put("Apples", 2.31);
    products.put("Tomato", 2.58);
    products.put("Potato", 1.75);
    products.put("Onion", 1.10);

    /* Represent Bob's shopping list

      Product	Amount
      Milk	3
      Rice	2
      Eggs	2
      Cheese	1
      Chicken Breasts	4
      Apples	1
      Tomato	2
      Potato	1 */
    HashMap<String, Integer> bobList = new HashMap<>();
    bobList.put("Milk", 3);
    bobList.put("Rice", 2);
    bobList.put("Eggs", 2);
    bobList.put("Cheese", 1);
    bobList.put("Chicken Breasts", 4);
    bobList.put("Apples", 1);
    bobList.put("Tomato", 2);
    bobList.put("Potato", 1);

    /* Represent Alice's shopping list

      Product	Amount
      Rice	1
      Eggs	5
      Chicken Breasts	2
      Apples	1
      Tomato	10 */
    HashMap<String, Integer> aliceList = new HashMap<>();
    aliceList.put("Rice", 1);
    aliceList.put("Eggs", 5);
    aliceList.put("Chicken Breasts", 2);
    aliceList.put("Apples", 1);
    aliceList.put("Tomato", 10);

    // How much does Bob pay?
    // switch or for if
    double sumBob = 0.0;
    for (Map.Entry<String, Integer> bobWants : bobList.entrySet()) {
      if (products.containsKey(bobWants.getKey())) {
        sumBob += bobWants.getValue() * products.get(bobWants.getKey());
      }
    }
    System.out.println("Bob pays a sum of: " + sumBob);

    // How much does Alice pay?
    // Thx Vivi for highlighting my version was not simple enough. :)
    double sumAlice = 0.0;
    for (String aliceWants : aliceList.keySet()) {
      sumAlice += aliceList.get(aliceWants) * products.get(aliceWants);
    }
    System.out.println("Alice pays a sum of: " + sumAlice);

    // Who buys more Rice?
    if (bobList.get("Rice") > aliceList.get("Rice")) {
      System.out.println("Bob buys more rice, " + bobList.get("Rice"));
    } else {
      System.out.println("Alice buys more rice, " + aliceList.get("Rice"));
    }

    // Who buys more Potato?
    if (bobList.containsKey("Potato")) {
      if (aliceList.containsKey("Potato")) {
        if (bobList.get("Potato") > aliceList.get("Potato")) {
          System.out.println("Bob buys more potato.");
        } else {
          System.out.println("Alice buys more potato.");
        }
      }
      System.out.println("Alice doesn't want potato so Bob gets more.");
    }

    // Who buys more different products?
    if (bobList.size() > aliceList.size()) {
      System.out.println("Bob buys more different products.");
    } else {
      System.out.println("Alice buys more products.");
    }

    // Who buys more products? (piece)
    int bobsNr = 0;
    int alicesNr = 0;
    for (Map.Entry<String, Integer> bobAmount : bobList.entrySet()) {
      bobsNr += bobAmount.getValue();
    }
    for (Map.Entry<String, Integer> aliceAmount : aliceList.entrySet()) {
      alicesNr += aliceAmount.getValue();
    }
    if (bobsNr > alicesNr) {
      System.out.println("Bob buys more pieces: " + bobsNr);
    } else {
      System.out.println("Alice buys more pieces: " + alicesNr);
    }
  }
}
