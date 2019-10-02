import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class SumTest {

  Sum newSum = new Sum();

  @Test
  public void sumThisListWithPositiveInts() {
    ArrayList<Integer> aList = new ArrayList<>(Arrays.asList(5, 6, 11, 1));
    int test = 23;
    int actual = newSum.sumThisList(aList);
    Assert.assertEquals(test, actual);
  }

  @Test
  public void sumThisListEmptyList() {
    ArrayList<Integer> aList = new ArrayList<>();
    int test = 0;
    int actual = newSum.sumThisList(aList);
    Assert.assertEquals(test, actual);
  }

  @Test
  public void sumThisListOneElement() {
    ArrayList<Integer> aList = new ArrayList<>(Arrays.asList(5));
    int test = 5;
    int actual = newSum.sumThisList(aList);
    Assert.assertEquals(test, actual);
  }

  @Test
  public void sumThisListMinusPlusZero() {
    ArrayList<Integer> aList = new ArrayList<>(Arrays.asList(0, -7, 7, 12));
    int test = 12;
    int actual = newSum.sumThisList(aList);
    Assert.assertEquals(test, actual);
  }

  @Test
  public void sumThisListNull() {
    ArrayList<Integer> aList = null;
    int actual = newSum.sumThisList(aList);
    Assert.assertEquals(null, actual);
  }
}