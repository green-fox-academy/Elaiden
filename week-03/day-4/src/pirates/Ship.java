package pirates;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {

  List<Pirate> crewOfShip;
  String nameOfTheShip;

  public Ship(){
    crewOfShip = new ArrayList<>();
  }

  public Ship(String nameOfTheShip) {
    crewOfShip = new ArrayList<>();
    this.nameOfTheShip = nameOfTheShip;
  }

  public void fillShip(String captainsName) {
    Pirate captain = new Pirate(captainsName, true);
    nameOfTheShip = this.nameOfTheShip;
    Random random = new Random();
    captain.drinkSomeRum(random.nextInt(4000));
    int piratesInTheCrew = random.nextInt(1000000) + 521463;
    for (int i = 0; i < piratesInTheCrew; i++) {
      this.crewOfShip.add(new Pirate());
    }
    System.out.println(
        "The pirate ship " + nameOfTheShip + " been summoned from the glorious past, under "
            + captain.nameOfPirate + "'s command, who drank " + captain.toxicLevel
            + " bottle of rums through his life, and is " + (captain.pirateAlive ? "alive"
            : "dead") + (captain.pirateAlive && !(captain.piratePassedOut)
            ? " and conscious." : " and unconscious.") + "He/She commands a crew of " + crewOfShip
            .size() + " rumthirsty pirates.");
  }

  /*public boolean shipBattle(String nameOfTheShip) {
    Random randRum = new Random();
    int scoreOfAttacker = crewScore(this.nameOfTheShip);
    int scoreOfTheDefender = crewScore(nameOfTheShip);
    if (scoreOfAttacker >= scoreOfTheDefender) {
      return true;
      for (int i = 0; i < this.crewOfShip.size(); i++) {
        int rumToDrink = randRum.nextInt(2) + 4;
        crewOfShip.get(i).drinkSomeRum(rumToDrink);
      }
    } else {
      return false;
    }
  }*/

  public int crewScore(String shipToCalculate) {
    int alivePirates = 0;
    for (int i = 0; i < this.crewOfShip.size(); i++) {
      if (crewOfShip.get(i).pirateAlive) {
        alivePirates++;
      }
    }
    int score = alivePirates - this.crewOfShip.get(0).toxicLevel;
    return score;
  }
}
