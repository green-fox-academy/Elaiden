import org.junit.Assert;
import org.junit.Test;

public class AppleTest {

  Apple testApple = new Apple();

  @Test
  public void getAppleWithExpectedString() {
    String test = "apple";
    String result = testApple.getApple();
    Assert.assertEquals(test, result);
  }

  @Test
  public void getAppleWithDifferentString() {
    String test = "onion";
    String result = testApple.getApple();
    Assert.assertEquals(test, result);
  }
}