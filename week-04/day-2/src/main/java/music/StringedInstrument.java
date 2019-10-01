package main.java.music;

public abstract class StringedInstrument extends Instrument {

  private int numberOfStrings;

  public abstract void sound();

  public void setNumberOfStrings(int numberOfStrings) {
    this.numberOfStrings = numberOfStrings;
  }

  public int getNumberOfStrings() {
    return numberOfStrings;
  }
}
