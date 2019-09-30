package gardenapp;

public class Tree extends Plant {

  public Tree() {
    super();
    this.setType("Tree");
    this.setAbsorbRate(0.4);
  }

  public Tree(String color) {
    super();
    this.setColor(color);
    this.setType("Tree");
    this.setAbsorbRate(0.4);
  }

}
