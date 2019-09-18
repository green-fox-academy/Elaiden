import java.util.Random;
import javax.swing.*;

import java.awt.*;


import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

  public static void mainDraw(Graphics graphics) {
    // draw four different size and color rectangles.
    // avoid code duplication.
    Random newRandom = new Random();
    int randomNumber = newRandom.nextInt(255);
    int randomSize = newRandom.nextInt(50);
    int startingPosX = 0;
    int startingPosY = 0;
    for (int i = 1; i < 5; i++) {
      randomNumber = newRandom.nextInt(255);
      randomSize = newRandom.nextInt(50);
      graphics.setColor(new Color(randomNumber, randomNumber, randomNumber));
      graphics.fillRect(startingPosX, startingPosY, randomNumber, randomSize);
      startingPosX += randomNumber / 2;
      startingPosY += randomNumber / 3;
    }


  }

  // Don't touch the code below
  static int WIDTH = 800;
  static int HEIGHT = 600;

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