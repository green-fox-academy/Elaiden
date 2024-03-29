import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;

public class Exercise4 {

  public static void main(String[] args) {

    // Write a Stream Expression to get the average value of the odd numbers from the following list:

    List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

    DoubleSummaryStatistics stat = numbers.stream()
        .filter(x -> x % 2 != 0)
        .mapToDouble(x -> x).summaryStatistics();

    System.out.println(stat.getAverage());
  }
}
