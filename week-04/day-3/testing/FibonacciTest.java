import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {

  Fibonacci newTest = new Fibonacci();

  @Test
  public void giveIndexFibonacciNegativeNumber() {
    int index = -5;
    int result = newTest.giveIndexFibonacci(index);
    Assert.assertEquals(-1, result);
  }

  @Test
  public void giveIndexFibonacciNormalNumber() {
    int index = 5;
    int result = newTest.giveIndexFibonacci(index);
    Assert.assertEquals(5, result);
  }
}