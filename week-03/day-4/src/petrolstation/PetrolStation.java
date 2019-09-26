package petrolstation;

public class PetrolStation {

  public static void main(String[] args) {

    /*Create Station and Car classes
        Station
    gasAmount
    refill(car) -> decreases the gasAmount by the capacity of the car and increases the cars gasAmount
    Car
        gasAmount
    capacity
    create constructor for Car where:
    initialize gasAmount -> 0
    initialize capacity -> 100*/

    Station newStation = new Station();
    Car randomCar = new Car();

    newStation.refill(randomCar);
  }
}
