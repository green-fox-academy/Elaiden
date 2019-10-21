import java.util.HashMap;
import java.util.Map;

public class Exercise9 {

  public static void main(String[] args) {

    // Write a Stream Expression to find the frequency of characters in a given string!

    String word = "telhetetlen";
    Map<Character, Integer> letterFrequency = new HashMap<>();

    word.chars()
        .forEach(letter -> letterFrequency
            .put((char) letter, letterFrequency.getOrDefault((char) letter, 0) + 1));

    System.out.println(letterFrequency);

  }
}