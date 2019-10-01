import main.java.animals.Bird;
import main.java.animals.Mammal;
import main.java.animals.Reptile;


public class Zoo {

  public static void main(String[] args) {

    System.out.println("=====");
    System.out.println(
        "https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/interfaces/zoo/java.md");
    System.out.println("=====");

    Reptile reptile = new Reptile("Crocodile");
    Mammal mammal = new Mammal("Koala");
    Bird bird = new Bird("Parrot");

    System.out.println("How do you breed?");
    System.out.println("A " + reptile.getName() + " is breeding by " + reptile.breed());
    System.out.println("A " + mammal.getName() + " is breeding by " + mammal.breed());
    System.out.println("A " + bird.getName() + " is breeding by " + bird.breed());
  }
}

