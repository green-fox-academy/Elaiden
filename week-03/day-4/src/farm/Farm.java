package farm;

import java.util.ArrayList;
import java.util.List;

public class Farm {

  List<Animal> animals;
  int freeSlots = 4;

  public Farm() {
    this.animals = new ArrayList<>();
  }

  public void breed() {
    if (this.freeSlots > 0) {
      Animal anotherAnimal = new Animal();
      animals.add(anotherAnimal);
      this.freeSlots--;
    }
  }

  public void slaughter() {
    for (Animal animal : animals) {
      if (animal.hunger == 50) {
        animals.remove(animal);
        this.freeSlots++;
        break;
      }
    }
  }
}
