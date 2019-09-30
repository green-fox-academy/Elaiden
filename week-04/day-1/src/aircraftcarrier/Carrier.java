package aircraftcarrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {

  private List<Aircraft> aircrafts;
  private int ammoStored;
  private int healthPoints;

  public Carrier(int ammoStored, int healthPoints) {
    this.aircrafts = new ArrayList<>();
    this.ammoStored = ammoStored;
    this.healthPoints = healthPoints;
  }

  public void add(Aircraft aircraft) {
    aircrafts.add(aircraft);
  }

  public void fill() {
    int sumAmmoNeed = 0;
    for (Aircraft aircraft : aircrafts) {
      sumAmmoNeed += (aircraft.getAmmoMax() - aircraft.getAmmoActual());
    }
    if (this.getAmmoStored() == 0) {
      throw new IllegalArgumentException("There is no ammo.");
    } else if (sumAmmoNeed > this.getAmmoStored()) {
      for (Aircraft aircraft : aircrafts) {
        if (aircraft.isPriority()) {
          this.setAmmoStored(
              this.getAmmoStored() - aircraft.getAmmoMax() - aircraft.getAmmoActual());
          aircraft.refill(aircraft.getAmmoMax() - aircraft.getAmmoActual());
        }
      }
      while (this.getAmmoStored() > 0) {
        for (Aircraft aircraft : aircrafts) {
          if (!aircraft.isPriority()) {
            this.setAmmoStored(
                this.getAmmoStored() - aircraft.getAmmoMax() - aircraft.getAmmoActual());
            aircraft.refill(aircraft.getAmmoMax() - aircraft.getAmmoActual());
          }
        }
      }
    } else {
      for (Aircraft aircraft : aircrafts) {
        aircraft.refill(aircraft.getAmmoMax() - aircraft.getAmmoActual());
      }
    }
  }

  public void fight(Carrier carrier) {
    int round = 1;
    System.out.println("Attacking the enemy carrier!");
    while (this.getHealthPoints() > 0 && carrier.getHealthPoints() > 0) {
      System.out.println("Round " + round + "!");
      this.fill();
      carrier.fill();
      carrier.setHealthPoints(carrier.getHealthPoints() - this.carrierTotalDamage());
      System.out.println(
          "Enemy carrier damaged for " + this.carrierTotalDamage() + ", remaining HP: " + carrier
              .getHealthPoints());
      if (carrier.getHealthPoints() > 0) {
        this.setHealthPoints(this.getHealthPoints() - carrier.carrierTotalDamage());
        System.out.println("The enemy carrier hits back for " + carrier.carrierTotalDamage()
            + ", our remaining HP is " + this.getHealthPoints());
      }
      round++;
    }
    if (this.getHealthPoints() > 0) {
      System.out.println("Our carrier won the fight!");
    } else if (carrier.getHealthPoints() > 0) {
      System.out.println("The enemy carrier won the fight!");
    } else {
      System.out.println("Nobody won today...");
    }
  }

  public void getStatus() {
    if (this.getHealthPoints() == 0) {
      System.out.println("It's dead Jim :(");
    } else {
      System.out.println("HP: " + this.getHealthPoints() + ", Aircraft count: " + aircrafts.size()
          + ", Ammo Storage: " + this.getAmmoStored() + ", Total damage: " + carrierTotalDamage());
      for (Aircraft aircraft : aircrafts) {
        aircraft.getStatus();
      }
    }
  }

  public int carrierTotalDamage() {
    int total = 0;
    for (Aircraft aircraft : aircrafts) {
      total += aircraft.totalDamage();
    }
    return total;
  }

  public List<Aircraft> getAircrafts() {
    return aircrafts;
  }

  public void setAircrafts(List<Aircraft> aircrafts) {
    this.aircrafts = aircrafts;
  }

  public int getAmmoStored() {
    return ammoStored;
  }

  public void setAmmoStored(int ammoStored) {
    this.ammoStored = ammoStored;
  }

  public int getHealthPoints() {
    return healthPoints;
  }

  public void setHealthPoints(int healthPoints) {
    this.healthPoints = healthPoints;
  }
}
