package pirates;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {

  List<Pirate> crewOfShip;
  String nameOfTheShip;
  Pirate captain;

  public Ship() {
    crewOfShip = new ArrayList<>();
  }

  public Ship(String nameOfTheShip) {
    crewOfShip = new ArrayList<>();
    this.nameOfTheShip = nameOfTheShip;
  }

  public void fillShip(String captainsName) {
    this.captain = new Pirate(captainsName, true);
    Random random = new Random();
    captain.drinkSomeRum(random.nextInt(5));
    int piratesInTheCrew = random.nextInt(50) + 30;
    for (int i = 0; i < piratesInTheCrew; i++) {
      this.crewOfShip.add(new Pirate());
    }
    System.out.println(
        "The pirate ship " + nameOfTheShip + " has been summoned from the glorious past, under "
            + captain.nameOfPirate + "'s command, who drank " + captain.toxicLevel
            + " bottle of rums today, and is " + (captain.pirateAlive ? "alive"
            : "dead") + (captain.pirateAlive && !(captain.piratePassedOut)
            ? " and conscious. " : " and unconscious. ") + "He/She commands a crew of " + crewOfShip
            .size() + " rumthirsty pirates.");
  }

  public boolean battle(Ship enemyShip) {
    Random random = new Random();
    if (this.crewScore() > enemyShip.crewScore()) {
      System.out.println(
          this.nameOfTheShip + " wins the battle and the crew has it's well earned party!");
      this.captain.drinkSomeRum(random.nextInt(5) + 1);
      if (this.captain.piratePassedOut) {
        System.out.println("What a victory, our captain just hit the wheel!");
      }
      int passedOutPirates = 0;
      for (Pirate pirate : this.crewOfShip) {
        pirate.drinkSomeRum(random.nextInt(6));
        if (pirate.piratePassedOut) {
          passedOutPirates++;
        }
      }
      System.out
          .println("A total of " + passedOutPirates + " pirates passed out during the party.");
      int deadPirates = 0;
      for (Pirate enemy : enemyShip.crewOfShip) {
        enemy.pirateAlive = random.nextBoolean();
        if (!enemy.pirateAlive) {
          deadPirates++;
        }
      }
      enemyShip.captain.pirateAlive = random.nextBoolean();
      System.out.println("The enemy ship " + enemyShip.nameOfTheShip + " lost " + deadPirates
          + " souls and their leader, " + enemyShip.captain.nameOfPirate + (
          enemyShip.captain.pirateAlive
              ? " managed to survive the chaos." : " has died in the battle."));

      return true;

    } else if (this.crewScore() == enemyShip.crewScore()) {
      System.out
          .println("What a beautiful day on the ocean, all the pirates having fun together :P");
    } else {
      System.out.println(
          enemyShip.nameOfTheShip + " wins the battle and the crew has it's well earned party!");
      enemyShip.captain.drinkSomeRum(random.nextInt(5) + 1);
      if (enemyShip.captain.piratePassedOut) {
        System.out.println("What a victory, their captain just hit the wheel!");
      }
      int passedOutPirates = 0;
      for (Pirate pirate : enemyShip.crewOfShip) {
        pirate.drinkSomeRum(random.nextInt(6));
        if (pirate.piratePassedOut) {
          passedOutPirates++;
        }
      }
      System.out
          .println("A total of " + passedOutPirates + " pirates passed out during the party.");
      int deadPirates = 0;
      for (Pirate our : this.crewOfShip) {
        our.pirateAlive = random.nextBoolean();
        if (!our.pirateAlive) {
          deadPirates++;
        }
      }
      this.captain.pirateAlive = random.nextBoolean();
      System.out.println("Our ship " + this.nameOfTheShip + " lost " + deadPirates
          + " good people and our man, " + this.captain.nameOfPirate + (this.captain.pirateAlive
          ? " managed to survive the chaos." : " has died in the battle."));
    }
    return false;
  }

  public int crewScore() {
    int alivePirates = 0;
    for (Pirate pirate : this.crewOfShip) {
      if (pirate.pirateAlive) {
        alivePirates++;
      }
    }
    return alivePirates - this.captain.toxicLevel;
  }
}