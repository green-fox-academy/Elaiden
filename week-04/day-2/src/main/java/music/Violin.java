package main.java.music;

public class Violin extends StringedInstrument {

  public Violin() {
    this.setNumberOfStrings(4);
    this.setName("Violin");
  }

  @Override
  public void sound() {
    System.out.println("Screech");
  }

  @Override
  public void play() {
    System.out.print(this.getName() + " a " + this.getNumberOfStrings()
        + "-stringed instrument that goes ");
    this.sound();
  }
}
