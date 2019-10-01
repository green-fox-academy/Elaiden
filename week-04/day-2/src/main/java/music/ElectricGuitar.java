package main.java.music;

public class ElectricGuitar extends StringedInstrument {

  public ElectricGuitar() {
    this.setName("Electric Guitar");
    this.setNumberOfStrings(6);
  }

  public ElectricGuitar(int numberOfStrings) {
    this.setName("Electric Guitar");
    this.setNumberOfStrings(numberOfStrings);
  }

  @Override
  public void sound() {
    System.out.println("Twang");
  }

  @Override
  public void play() {
    System.out.print(this.getName() + " a " + this.getNumberOfStrings()
        + "-stringed instrument that goes ");
    this.sound();
  }
}
