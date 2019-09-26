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
    Car anotherCar = new Car();
    Car thirdCar = new Car();
    Car fourthCar = new Car();
    Car fifthCar = new Car();
    Car loser = new Car();

    newStation.refill(randomCar);
    newStation.refill(anotherCar);
    newStation.refill(thirdCar);
    newStation.refill(fourthCar);
    newStation.refill(fifthCar);
    newStation.refill(loser);

  }
}
