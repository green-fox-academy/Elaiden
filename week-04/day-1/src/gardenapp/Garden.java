package gardenapp;

import java.util.ArrayList;
import java.util.List;

public class Garden {

  private List<Plant> plants;

  public Garden() {
    this.setPlants(new ArrayList<>());
  }

  public void addPlant(Plant plant) {
    plants.add(plant);
  }

  public void gardenInfo() {
    for (Plant plant : plants) {
      if (needsWatering(plant)) {
        System.out.println("The " + plant.getColor() + " " + plant.getType() + " needs water.");
      } else {
        System.out
            .println("The " + plant.getColor() + " " + plant.getType() + " doesn't need water.");
      }
    }
    System.out.println();
  }

  public void watering(double amount) {
    System.out.println("Watering with " + amount);
    int plantsToWater = 0;
    for (Plant plant : plants) {
      if (needsWatering(plant)) {
        plantsToWater++;
      }
    }
    for (Plant plant : plants) {
      if (needsWatering(plant)) {
        plant.setWaterLevel(
            plant.getWaterLevel() + (plant.getAbsorbRate() * (amount / plantsToWater)));
        if (needsWatering(plant)) {
          System.out.println("The " + plant.getColor() + " " + plant.getType() + " needs water.");
        } else {
          System.out
              .println("The " + plant.getColor() + " " + plant.getType() + " doesn't need water.");
        }
      } else {
        System.out
            .println("The " + plant.getColor() + " " + plant.getType() + " doesn't need water.");
      }
    }
    System.out.println();
  }

  public boolean needsWatering(Plant plant) {
    if ((plant.getType().equals("Flower") && plant.getWaterLevel() < 5) || (plant.getType()
        .equals("Tree") && plant.getWaterLevel() < 10)) {
      return true;
    } else {
      return false;
    }
  }

  public List<Plant> getPlants() {
    return plants;
  }

  public void setPlants(List<Plant> plants) {
    this.plants = plants;
  }
}
