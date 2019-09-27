public class Power {

  public static void main(String[] args) {

    // Given base and n that are both 1 or more, compute recursively (no loops) the value of base to the n power, so powerN(3, 2) is 9 (3 squared).

    double base = 9;
    double n = 12;
    System.out.println(powerN(base, n));
  }

  public static double powerN(double base, double n) {
    if (base == 0) {
      return 0;
    } else if (n == 0) {
      return 1;
    } else if (n == 1) {
      return base;
    } else {
      return Math.round(base * powerN(base, n - 1));
    }
  }
}
