package implementcharsequence;

public class Shifter implements CharSequence {

  private String word;
  private int shift;

  public Shifter(String word, int shift) {
    this.word = word;
    this.shift = shift;
  }

  @Override
  public int length() {
    return word.length();
  }

  @Override
  public char charAt(int index) {
    return word.charAt(index + shift);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return word.subSequence(start, end);
  }
}
