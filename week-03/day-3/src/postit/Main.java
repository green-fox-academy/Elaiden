package postit;

import java.awt.Color;

public class Main {

  public static void main(String[] args) {

    PostIt firstPost = new PostIt(Color.ORANGE, "Idea 1", Color.BLUE);
    PostIt secondPost = new PostIt(Color.PINK, "Awesome", Color.BLACK);
    PostIt thirdPost = new PostIt(Color.YELLOW, "Superb!", Color.GREEN);
    
  }
}
