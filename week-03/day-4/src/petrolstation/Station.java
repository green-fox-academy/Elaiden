package petrolstation;

public class Station {

  int gasAmount = 500;

  public void refill(Car car) {
    while (car.gasAmount < car.capacity && this.gasAmount > 0) {
      this.gasAmount -= car.capacity - car.gasAmount;
      car.gasAmount += car.capacity - car.gasAmount;
      if (this.gasAmount == 0) {
        System.out.println("Station closed, no more gas for now.");
      }
    }

  }
}
