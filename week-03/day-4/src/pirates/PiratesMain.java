package pirates;

import java.util.Scanner;

public class PiratesMain {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("How's the ship called?");
    String nameOfTheShip = input.nextLine();
    Ship newSh = new Ship(nameOfTheShip);
    System.out.println("Who's the captain?");
    String nameOfTheCaptain = input.nextLine();
    newSh.fillShip(nameOfTheCaptain);
  }
}
