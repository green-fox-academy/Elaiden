public class Fibonacci {

  public int giveIndexFibonacci(int index) {
    if (index < 0) {
      return -1;
    } else if (index == 0) {
      return 0;
    } else if (index == 1) {
      return 1;
    } else {
      return giveIndexFibonacci(index - 1) + giveIndexFibonacci(index - 2);
    }
  }
}
