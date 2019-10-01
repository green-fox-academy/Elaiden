package main.java.animals;

public class Mammal extends Animal {

  private boolean hasFur;
  private String habitat;  // water, land

  public Mammal(String name) {
    super(name);
  }

  @Override
  public String breed() {
    return "pushing miniature versions out.";
  }

  @Override
  public void sleep() {

  }

  public void setHasFur(boolean hasFur) {
    this.hasFur = hasFur;
  }

  public void setHabitat(String habitat) {
    this.habitat = habitat;
  }
}
