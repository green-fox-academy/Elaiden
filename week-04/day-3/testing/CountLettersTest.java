import java.util.HashMap;
import org.junit.Assert;
import org.junit.Test;

public class CountLettersTest {

  CountLetters testCount = new CountLetters();

  @Test
  public void countLettersOneCapitalLetter() {
    String word = "A";
    HashMap<String, Integer> expected = new HashMap<>();
    expected.put("a", 1);
    HashMap<String, Integer> actual = testCount.countLetters(word);
    Assert.assertEquals(expected, actual);
  }

  @Test
  public void countLettersMultipleSame() {
    String word = "aaaaaaaa";
    HashMap<String, Integer> expected = new HashMap<>();
    expected.put("a", 8);
    HashMap<String, Integer> actual = testCount.countLetters(word);
    Assert.assertEquals(expected, actual);
  }

  @Test
  public void countLettersNormalWord() {
    String word = "Mothership";
    HashMap<String, Integer> expected = new HashMap<>();
    expected.put("m", 1);
    expected.put("o", 1);
    expected.put("t", 1);
    expected.put("h", 2);
    expected.put("e", 1);
    expected.put("r", 1);
    expected.put("s", 1);
    expected.put("i", 1);
    expected.put("p", 1);
    HashMap<String, Integer> actual = testCount.countLetters(word);
    Assert.assertEquals(expected, actual);
  }
}