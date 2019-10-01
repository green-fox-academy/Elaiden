package main.java.animals;

import flyable.Flyable;

public class Bird extends Animal implements Flyable {

  public Bird(String name) {
    super(name);
  }

  @Override
  public String breed() {
    return "laying eggs.";
  }

  @Override
  public void sleep() {

  }

  @Override
  public void land() {

  }

  @Override
  public void fly() {

  }

  @Override
  public void takeOff() {

  }
}
