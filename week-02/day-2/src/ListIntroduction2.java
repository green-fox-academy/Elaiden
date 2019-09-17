import java.util.ArrayList;
import java.util.Arrays;

public class ListIntroduction2 {

  public static void main(String[] args) {

    /* Create a list ('List A') which contains the following values
        Apple, Avocado, Blueberries, Durian, Lychee */
    ArrayList<String> listA = new ArrayList<>();
    listA.add("Apple");
    listA.add("Avocado");
    listA.add("Blueberries");
    listA.add("Durian");
    listA.add("Lychee");

    // Create a new list ('List B') with the values of List A
    ArrayList<String> listB = new ArrayList<>();
    listB.addAll(listA);

    // Print out whether List A contains Durian or not
    System.out.println(listA.contains("Durian"));

    // Remove Durian from List B
    listB.remove("Durian");

    // Add Kiwifruit to List A after the 4th element
    listA.add(4, "Kiwifruit");

    // Compare the size of List A and List B
    System.out.println(listA == listB);

    // Get the index of Avocado from List A
    System.out.println(listA.indexOf("Avocado"));

    // Get the index of Durian from List B
    System.out.println(listB.indexOf("Durian")); // -1 because it has been removed

    // Add Passion Fruit and Pomelo to List B in a single statement
    listB.addAll(new ArrayList<>(Arrays.asList("Passion Fruit", "Pomelo")));

    // Print out the 3rd element from List A
    System.out.println(listA.get(2));
  }
}
