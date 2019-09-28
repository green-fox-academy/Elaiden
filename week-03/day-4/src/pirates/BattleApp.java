package pirates;

import java.util.Scanner;

public class BattleApp {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("How's the  first ship called?");
    String firstSh = input.nextLine();

    Ship firstShip = new Ship(firstSh);
    System.out.println("Who's the captain?");
    String firstCaptain = input.nextLine();

    firstShip.fillShip(firstCaptain);

    System.out.println("How's the second ship called?");
    String secondSh = input.nextLine();

    Ship secondShip = new Ship(secondSh);
    System.out.println("Who's the captain?");
    String secondCaptain = input.nextLine();

    secondShip.fillShip(secondCaptain);

    System.out.println();
    System.out.println("=======================================");
    System.out.println();

    firstShip.battle(secondShip);
  }
}

