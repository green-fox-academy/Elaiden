package postit;

import java.awt.Color;

public class Main {

  public static void main(String[] args) {

    /*Create a PostIt class that has
        a backgroundColor
        a text on it
        a textColor
        Create a few example post-it objects:
    an orange with blue text: "Idea 1"
    a pink with black text: "Awesome"
    a yellow with green text: "Superb!"*/

    PostIt firstPost = new PostIt(Color.ORANGE, "Idea 1", Color.BLUE);
    PostIt secondPost = new PostIt(Color.PINK, "Awesome", Color.BLACK);
    PostIt thirdPost = new PostIt(Color.YELLOW, "Superb!", Color.GREEN);

  }
}
