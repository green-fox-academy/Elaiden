public class SumDigits {

  public static void main(String[] args) {

    /*Given a non-negative integer n, return the sum of its digits recursively (without loops).

        Hint
    Mod (%) by 10 yields the rightmost digit (e.g. 126 % 10 is 6)

    Java, C++, C#, Python
    Divide (/) by 10 removes the rightmost digit (e.g. 126 / 10 is 12).*/

    int n = 1984;
    System.out.println(sumDigits(n));
  }

  public static int sumDigits(int n) {
    if (n / 10 == 0 && n % 10 == 0) {
      return 0;
    } else {
      return (n % 10) + sumDigits(n / 10);
    }
  }
}
