package pirates;

import java.util.Random;

public class Pirate {

  public String nameOfPirate;
  int toxicLevel = 0;
  boolean pirateAlive = true;
  boolean piratePassedOut = false;
  boolean hasAParrot = false;

  public Pirate() {

  }

  public Pirate(String nameHim, boolean hasAParrot) {
    this.nameOfPirate = nameHim;
    this.hasAParrot = hasAParrot;
    if (hasAParrot) {
      this.nameOfPirate = "Captain " + this.nameOfPirate;
    }
  }

  public void drinkSomeRum() {
    if (this.pirateAlive && !this.piratePassedOut) {
      this.toxicLevel++;
      System.out.println("Moar, moaaarr rum lad!");
      if (this.toxicLevel >= 4) {
        this.piratePassedOut = true;
      }
    } else if (!this.pirateAlive) {
      System.out.println("He's dead...");
    }
  }

  public void drinkSomeRum(int howMany) {
    if (this.pirateAlive && !this.piratePassedOut) {
      this.toxicLevel += howMany;
      if (this.toxicLevel >= 4) {
        this.piratePassedOut = true;
      }
    } else if (!this.pirateAlive) {
      System.out.println("He's dead...");
    }
  }

  public void howsItGoingMate() {
    if (this.pirateAlive) {
      if (this.toxicLevel < 4) {
        drinkSomeRum();
      } else {
        System.out.println(
            "\"Arghh, I'ma Pirate. How d'ya d'ink its goin?\", the pirate passes out and sleeps it off.");
        this.piratePassedOut = true;
      }
    } else {
      System.out.println("He's dead...");
    }
  }

  public void die() {
    this.pirateAlive = false;
  }

  public void brawl(Pirate pirate) {
    if (this.pirateAlive && pirate.pirateAlive) {
      Random random = new Random();
      int event = random.nextInt(3);
      switch (event) {
        case 0:
          this.pirateAlive = false;
          System.out.println("The attacking pirate died.");
          break;
        case 1:
          pirate.pirateAlive = false;
          System.out.println("The attacked pirate died.");
          break;
        default:
          this.piratePassedOut = true;
          pirate.piratePassedOut = true;
          System.out.println("Both pirates passed out.");
          break;
      }
    } else if (this.pirateAlive && !pirate.pirateAlive) {
      System.out.println("Ain't gonna kick this fella's body yarr...");
    } else if (!this.pirateAlive && pirate.pirateAlive) {
      System.out.println("What, how do I have to fight your contender?");
    } else {
      System.out.println("They are both dead...");
    }
  }
}
