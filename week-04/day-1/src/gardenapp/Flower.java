package gardenapp;

public class Flower extends Plant {

  public Flower() {
    super();
    this.setType("Flower");
    this.setAbsorbRate(0.75);
  }

  public Flower(String color) {
    super(color, "Flower");
    this.setAbsorbRate(0.75);
  }
}
