import org.junit.Assert;
import org.junit.Test;

public class AnagramCheckerTest {

  AnagramChecker newCheck = new AnagramChecker();

  @Test
  public void anagramCheckSameStrings() {
    String firstW = "listen";
    String secondW = "listen";
    boolean actual = newCheck.anagramCheck(firstW, secondW);
    Assert.assertTrue(actual);
  }

  @Test
  public void anagramCheckAnagramStrings() {
    String firstW = "listen";
    String secondW = "silent";
    boolean actual = newCheck.anagramCheck(firstW, secondW);
    Assert.assertTrue(actual);
  }

  @Test
  public void anagramCheckDifferentNonAnagramStrings() {
    String firstW = "listen";
    String secondW = "liston";
    boolean actual = newCheck.anagramCheck(firstW, secondW);
    Assert.assertFalse(actual);
  }
}