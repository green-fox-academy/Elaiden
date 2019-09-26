package farm;

public class Main {

  public static void main(String[] args) {

    /*Reuse your Animal class
    Create a Farm class
    it has list of Animals
    it has slots which defines the number of free places for animals
    breed() -> creates a new animal if there's place for it
    slaughter() -> removes the least hungry animal*/

    Farm myFarm = new Farm();
    Animal dog = new Animal();
    Animal cat = new Animal();
    Animal monkey = new Animal();
    Animal bear = new Animal();

    myFarm.animals.add(dog);
    myFarm.animals.add(cat);
    myFarm.animals.add(monkey);
    myFarm.animals.add(bear);

    myFarm.breed();
    myFarm.slaughter();


  }
}
