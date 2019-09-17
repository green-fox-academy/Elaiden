import java.util.HashMap;

public class MapIntroduction1 {

  public static void main(String[] args) {

    // Create an empty map where the keys are integers and the values are characters
    HashMap<Integer, Character> mappieMap = new HashMap<>();

    // Print out whether the map is empty or not
    System.out.println(mappieMap.isEmpty());

    /* Add the following key-value pairs to the map
      Key	Value
      97	a
      98	b
      99	c
      65	A
      66	B
      67	C */
    mappieMap.put(97, 'a');
    mappieMap.put(98, 'b');
    mappieMap.put(99, 'c');
    mappieMap.put(65, 'A');
    mappieMap.put(66, 'B');
    mappieMap.put(67, 'C');

    // Print all the keys
    System.out.println(mappieMap.keySet());

    // Print all the values
    System.out.println(mappieMap.values());

    // Add value D with the key 68
    mappieMap.put(68, 'D');

    // Print how many key-value pairs are in the map
    System.out.println(mappieMap.size());

    // Print the value that is associated with key 99
    System.out.println(mappieMap.get(99));

    // Remove the key-value pair where with key 97
    mappieMap.remove(97);

    // Print whether there is an associated value with key 100 or not
    System.out.println(mappieMap.containsKey(100));

    // Remove all the key-value pairs
    mappieMap.clear();
  }
}
