import java.util.ArrayList;
import java.util.Arrays;

public class AnagramChecker {

  public boolean anagramCheck(String firstW, String secondW) {
    String[] firstWordChars = firstW.split("");
    String[] secondWordChars = secondW.split("");

    Arrays.sort(firstWordChars);
    Arrays.sort(secondWordChars);
    for (String character : firstWordChars) {
      System.out.print(character + " ");
    }
    System.out.println();
    for (String character : secondWordChars) {
      System.out.print(character + " ");
    }
    System.out.println();
    return new ArrayList<>(Arrays.asList(firstWordChars))
        .equals(new ArrayList<>(Arrays.asList(secondWordChars)));
  }
}
