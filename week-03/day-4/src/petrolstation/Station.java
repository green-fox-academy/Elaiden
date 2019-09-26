package petrolstation;

public class Station {

  int gasAmount = 500;

  public void refill(Car car) {
    this.gasAmount -= car.capacity;
    car.gasAmount = car.capacity;
  }
}
