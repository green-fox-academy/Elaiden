package counter;

public class Main {

  public static void main(String[] args) {

  /* Create Counter class
  which has an integer field value
  when creating it should have a default value 0 or we can specify it when creating
  we can add(number) to this counter another whole number
  or we can add() without parameters just increasing the counter's value by one
  and we can get() the current value
  also we can reset() the value to the initial value
  Check if everything is working fine with the proper test
  Download CounterTest.java and place it next to your solution
  If something's red in it, ALT+Enter Add JUnit5 to classpath (5 aka JUnit FIVE not 4 or 3)
  Then run the tests with the green play button before the lines (run all of them before the classname)
  */

    Counter countMe = new Counter(5);
    countMe.add(70);
    countMe.reset();
  }
}
