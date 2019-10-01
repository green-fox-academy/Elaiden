package main.java.music;

public class BassGuitar extends StringedInstrument {

  public BassGuitar() {
    this.setName("Bass Guitar");
    this.setNumberOfStrings(4);
  }

  public BassGuitar (int numberOfStrings) {
    this.setNumberOfStrings(numberOfStrings);
    this.setName("Bass Guitar");
  }

  @Override
  public void sound() {
    System.out.println("Duum-duum-duum");
  }

  @Override
  public void play() {
    System.out.print(this.getName() + " a " + this.getNumberOfStrings()
        + "-stringed instrument that goes ");
    this.sound();
  }
}
