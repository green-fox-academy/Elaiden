public class SwapElements {

  public static void main(String[] args) {

    // - Create an array variable named `abc`
    //   with the following content: `["first", "second", "third"]`
    // - Swap the first and the third element of `abc`

    String[] abc = {"first", "second", "third"};
    String[] swappedAbc = arrayElementSwap(abc);

    for (String words: swappedAbc) {
      System.out.println(words);
    }

  }
  public static String[] arrayElementSwap (String[] target) {
    String buffer = target[0];
    target[0] = target[2];
    target[2] = buffer;
    return target;
  }
}
