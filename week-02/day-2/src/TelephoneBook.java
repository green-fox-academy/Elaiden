import java.util.HashMap;
import java.util.Map;

public class TelephoneBook {

  public static void main(String[] args) {

    /* Create a map with the following key-value pairs.

      Name (key)	Phone number (value)
      William A. Lathan	405-709-1865
      John K. Miller	402-247-8568
      Hortensia E. Foster	606-481-6467
      Amanda D. Newland	319-243-5613
      Brooke P. Askew	307-687-2982 */
    HashMap<String, String> book = new HashMap<>();
    book.put("William A. Lathan", "405-709-1865");
    book.put("John K. Miller", "402-247-8568");
    book.put("Hortensia E. Foster", "606-481-6467");
    book.put("Amanda D. Newland", "319-243-5613");
    book.put("Brooke P. Askew", "307-687-2982");

    // What is John K. Miller's phone number?
    System.out.println("His phone number is: " + book.get("John K. Miller"));

    // Whose phone number is 307-687-2982?
    for (Map.Entry<String, String> obj : book.entrySet()) {
      if (obj.getValue().equals("307-687-2982")) {
        System.out.println(obj.getKey());
      }
    }

    // Do we know Chris E. Myers' phone number?
    System.out.println(book.containsKey("Chris E. Myers"));
  }
}
