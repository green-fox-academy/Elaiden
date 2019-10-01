package main.java.animals;

public class Reptile extends Animal {

  private boolean hasLegs;

  public Reptile(String name) {
    super(name);
  }


  @Override
  public String breed() {
    return "laying eggs.";
  }

  @Override
  public void sleep() {

  }
}
