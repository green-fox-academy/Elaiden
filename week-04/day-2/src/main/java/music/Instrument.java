package main.java.music;

public abstract class Instrument {

  private String name;

  public abstract void play();

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
