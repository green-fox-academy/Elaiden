import java.util.Scanner;
import javax.swing.*;

import java.awt.*;


import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PositionSquare {

  public static void mainDraw(Graphics graphics) {
    // create a function that draws one square and takes 3 parameters:
    // the x and y coordinates of the square's top left corner and the graphics
    // and draws a 50x50 square from that point.
    // draw 3 squares with that function.
    // avoid code duplication.
    Scanner input = new Scanner(System.in);
    System.out.print("Add the X coordinate for the starting square: ");
    int x = input.nextInt();
    System.out.print("Add the Y coordinate for the starting square: ");
    int y = input.nextInt();

    drawRects(x, y, graphics);

  }

  public static void drawRects(int x, int y, Graphics graphics) {
    for (int i = 0; i <= 300; i += 100) {
      graphics.setColor(Color.RED);
      graphics.drawRect(x, y, 50, 50);
      x += i;
      y += i;
    }
  }

  // Don't touch the code below
  static int WIDTH = 1024;
  static int HEIGHT = 768;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    ImagePanel panel = new ImagePanel();
    panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    jFrame.add(panel);
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
    jFrame.pack();
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }

}