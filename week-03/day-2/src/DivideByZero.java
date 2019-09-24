public class DivideByZero {

  public static void main(String[] args) {

    int numberAsDivider = 0;

    divideTen(numberAsDivider);
  }

  public static void divideTen(int divider) {
    int numberToDivide = 10;
    int result = 0;
    try {
      result = numberToDivide / divider;
    } catch (ArithmeticException exc) {
      System.out.println("fail");
    } catch (Exception valami) {
      System.out.println("Valami mas hiba torpent.");
    }
    System.out.println(result);
  }
}
