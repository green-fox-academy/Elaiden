import java.util.ArrayList;

public class Sum {

  public int sumThisList(ArrayList<Integer> thisList) {
    int sum = 0;
    for (int element : thisList) {
      sum += element;
    }
    return sum;
  }
}
