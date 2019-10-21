import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise8 {

  public static void main(String[] args) {

    // Write a Stream Expression to concatenate a Character list to a string!

    List<Character> charList = Arrays.asList('a', 'b', 'o', 'r', 't');

    String wordComplete = charList.stream()
        .map(letter -> letter.toString())
        .collect(Collectors.joining(""));

    System.out.println(wordComplete);
  }
}