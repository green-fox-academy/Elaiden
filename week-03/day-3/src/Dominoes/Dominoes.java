package Dominoes;

import java.util.ArrayList;
import java.util.List;

public class Dominoes {

  public static void main(String[] args) {
    List<Domino> dominoes = initializeDominoes();
    List<Domino> sorted = new ArrayList<Domino>();

    sorted.add(dominoes.get(0));
    dominoes.remove(0);

    int counterDomNr = 0;
    int sortedDomNr = 0;

    while (dominoes.size() != 0) {
      if (dominoes.get(counterDomNr).getLeftSide() == sorted.get(sortedDomNr).getRightSide()) {
        sorted.add(dominoes.get(counterDomNr));
        dominoes.remove(counterDomNr);
        sortedDomNr++;
        counterDomNr = 0;
      } else {
        counterDomNr++;
      }
    }
    // You have the list of Dominoes
    // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
    // eg: [2, 4], [4, 3], [3, 5] ...
    System.out.println(sorted);
  }

  static List<Domino> initializeDominoes() {
    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(5, 2));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(1, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 1));
    return dominoes;
  }

}