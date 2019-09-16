public class Reverse {

  public static void main(String[] args) {

    // - Create an array variable named `aj`
    //   with the following content: `[3, 4, 5, 6, 7]`
    // - Reverse the order of the elements in `aj`
    // - Print the elements of the reversed `aj`

    int[] aj = {3, 4, 5, 6, 7};
    int swapBuffer;
    int breakSwap = aj.length / 2;

    for (int i = 0; i < aj.length; i++) {
      swapBuffer = aj[i];
      aj[i] = aj[aj.length - 1 - i];
      aj[aj.length - 1 - i] = swapBuffer;
      if (i == breakSwap) {
        break;
      }
    }
    for (int num : aj) {
      System.out.println(num);
    }
    ;
  }
}
