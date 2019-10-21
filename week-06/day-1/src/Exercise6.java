import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise6 {

  public static void main(String[] args) {

    // Write a Stream Expression to find the uppercase characters in a string!

    String gibberish = "lEeT";

    List<String> uppercases = Arrays.asList(gibberish.split("")).stream()
        .filter(letter -> letter.equals(letter.toUpperCase()))
        .collect(Collectors.toList());

    System.out.println(uppercases);
  }
}
