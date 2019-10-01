package main.java.animals;

public abstract class Animal {

  private String name;
  private int age;
  private String gender;
  private String color;

  public Animal(String name) {
    this.name = name;
  }

  public abstract String breed();

  public abstract void sleep();

  public String getName() {
    return name;
  }
}
