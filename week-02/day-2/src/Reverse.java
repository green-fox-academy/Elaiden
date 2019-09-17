public class Reverse {

  public static void main(String[] args) {

    String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

    // Create a method that can reverse a String, which is passed as the parameter
    // Use it on this reversed string to check it!
    // Try to solve this using charAt() first, and optionally anything else after.

    System.out.println(reverse(reversed));
  }

  public static String reverse(String textToReverse) {
    char[] reversedChars = new char[textToReverse.length()];
    for (int i = 0; i < reversedChars.length; i++) {
      reversedChars[i] = textToReverse.charAt(reversedChars.length - 1 - i);
    }
    String reversedString = new String(reversedChars);
    return reversedString;
  }
}
