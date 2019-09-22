import java.util.*;

public class Matchmaking {

  public static void main(String... args) {
    ArrayList<String> girls = new ArrayList<String>(
        Arrays.asList("Eve", "Ashley", "Claire", "Kat", "Jane"));
    ArrayList<String> boys = new ArrayList<String>(
        Arrays.asList("Joe", "Fred", "Tom", "Todd", "Neef", "Jeff"));

    // Write a method that joins the two lists by matching one girl with one boy into a new list
    // If someone has no pair, he/she should be the element of the list too
    // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

    System.out.println(makingMatches(girls, boys));
  }

  public static ArrayList<String> makingMatches(ArrayList<String> girls, ArrayList<String> boys) {
    ArrayList<String> matches = new ArrayList<>();
    for (int j = 0; j < girls.size(); j++) {
      matches.add(girls.get(j));
      matches.add(boys.get(j));
      if (j == girls.size() - 1) {
        matches.add(boys.get(j + 1));
      }
    }
    return matches;
  }
}