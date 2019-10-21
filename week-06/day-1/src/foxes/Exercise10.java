package foxes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise10 {

  public static void main(String[] args) {

    /*Create a Fox class with 3 properties:name, color and age Fill a list with at least 5 foxes and:

    Write a Stream Expression to find the foxes with green color!
        Write a Stream Expression to find the foxes with green color, and age less then 5 years!
        Write a Stream Expression to find the frequency of foxes by color!*/

    List<Fox> ourFoxes = new ArrayList<>();
    ourFoxes.add(new Fox("Vuk", "orange", 1));
    ourFoxes.add(new Fox("Ravasz", "green", 4));
    ourFoxes.add(new Fox("Zold", "green", 7));
    ourFoxes.add(new Fox("Agy", "black", 17));
    ourFoxes.add(new Fox("Green", "green", 2));

    ourFoxes.stream()
        .filter(fox -> fox.getColor().equals("green"))
        .forEach(fox -> System.out.println(fox.getName()));

    System.out.println("=======");

    ourFoxes.stream()
        .filter(fox -> fox.getColor().equals("green") && fox.getAge() < 5)
        .forEach(fox -> System.out.println(fox.getName()));

    System.out.println("=======");

    Map<String, Integer> colorFreq = new HashMap<>();
    ourFoxes.stream()
        .forEach(
            fox -> colorFreq.put(fox.getColor(), colorFreq.getOrDefault(fox.getColor(), 0) + 1));

    System.out.println(colorFreq);
  }
}
