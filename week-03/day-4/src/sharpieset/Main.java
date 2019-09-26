package sharpieset;

public class Main {

  public static void main(String[] args) {

    /*Reuse your Sharpie class
    Create SharpieSet class
    it contains a list of Sharpie
    countUsable() -> sharpie is usable if it has ink in it
    removeTrash() -> removes all unusable sharpies*/

    SharpieSet sharpieSet = new SharpieSet();

    sharpieSet.sharpieSet.add(new Sharpie("black", 12, 89));
    sharpieSet.sharpieSet.add(new Sharpie("orange", 8, 100));
    sharpieSet.sharpieSet.add(new Sharpie("purple", 1, 70));
    sharpieSet.sharpieSet.add(new Sharpie("green", 23, 23));
    sharpieSet.sharpieSet.add(new Sharpie("red", 5, 0));

    System.out.println(sharpieSet.countUsable());
    sharpieSet.removeTrash();
  }

}
