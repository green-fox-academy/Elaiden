import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class CountLetters {

  public HashMap<String, Integer> countLetters(String thisWord) {
    String[] charsOfWord = thisWord.toLowerCase().split("");
    Arrays.sort(charsOfWord);
    ArrayList<String> listOfLetters = new ArrayList<>(Arrays.asList(charsOfWord));
    HashMap<String, Integer> dictionary = new HashMap<>();
    int countofLetters;
    String currentL;
    String nextL;
    for (int letter = 0; letter < listOfLetters.size() + 1; letter++) {
      letter = 0;
      currentL = listOfLetters.get(letter);
      countofLetters = 1;
      for (int nextLetter = letter + 1; nextLetter <= listOfLetters.size() - 1; nextLetter++) {
        nextL = listOfLetters.get(nextLetter);
        if (currentL.equals(nextL)) {
          countofLetters++;
          listOfLetters.remove(nextLetter);
          nextLetter = 0;
        }
      }
      dictionary.put(currentL, countofLetters);
      listOfLetters.remove(letter);
    }
    return dictionary;
  }
}
