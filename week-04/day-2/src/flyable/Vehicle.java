package flyable;

public abstract class Vehicle {

  private String name;
  private String color;
  private boolean hasWheels;
  private int seats;

  public Vehicle(String name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public abstract void repaint();
}
