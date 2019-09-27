public class NumberAdder {

  public static void main(String[] args) {

    // Write a recursive function that takes one parameter: n and adds numbers from 1 to n.

    int n = 20;
    System.out.println(addNumbers(n));
  }

  public static int addNumbers(int n) {
    if (n == 1) {
      return 1;
    } else {
      return n + addNumbers(n - 1);
    }
  }
}
