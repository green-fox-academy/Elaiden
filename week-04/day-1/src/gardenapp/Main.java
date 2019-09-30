package gardenapp;

public class Main {

  public static void main(String[] args) {

    Flower yellowFlower = new Flower("yellow");
    Flower blueFlower = new Flower("blue");
    Tree purpleTree = new Tree("purple");
    Tree orangeTree = new Tree("orange");

    Garden myGarden = new Garden();
    myGarden.addPlant(yellowFlower);
    myGarden.addPlant(blueFlower);
    myGarden.addPlant(purpleTree);
    myGarden.addPlant(orangeTree);

    myGarden.gardenInfo();
    myGarden.watering(40);
    myGarden.watering(70);
  }
}
