package comparable;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

  /*Check out what is the Comparable interface
  Get your Domino class
  Implement the Comparable interface on the Domino
      why? we want to compare based on the result of Domino.compareTo()
  more info here
  First compare the first value and then the second
  List<Domino> dominoes = new ArrayList<>();
dominoes.add(new Domino(5, 2));
dominoes.add(new Domino(4, 6));
dominoes.add(new Domino(1, 5));
dominoes.add(new Domino(6, 7));
dominoes.add(new Domino(2, 4));
dominoes.add(new Domino(7, 1));

Collections.sort(dominoes);

  // the order of your dominoes should look like this: [[1,5], [2,4], [4,6], [5,2], [6,7], [7,1]]
  Make your Todo class implement Comparable
      It should compare the completed field first
      Then the description
      Or if you haven't got a separate Todo class, or it doesn't contain fields like description and completed, use your Thing class
*/
  public static void main(String[] args) {

    /*List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(5, 2));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(1, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 1));

    Collections.sort(dominoes);

    System.out.println(dominoes.toString());

    System.out.println("===========");

    for (Domino d : dominoes) {
      d.printAllFields();
    }*/

    List<Thing> fleet = new ArrayList<>();

    Thing getMilk = new Thing("Get milk");
    Thing remTheObst = new Thing("Remove the obstacles");
    Thing standUp = new Thing("Stand up");
    standUp.complete();
    Thing eatLunch = new Thing("Eat lunch");
    eatLunch.complete();

    fleet.add(getMilk);
    fleet.add(remTheObst);
    fleet.add(standUp);
    fleet.add(eatLunch);

    Collections.sort(fleet);

    System.out.println(fleet);

    System.out.println("===========");
    for (Thing t : fleet) {
      t.printAllFields();
    }
  }
}
