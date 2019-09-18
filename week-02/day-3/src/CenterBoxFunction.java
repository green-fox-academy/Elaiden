import java.util.Random;
import javax.swing.*;

import java.awt.*;


import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenterBoxFunction {

  public static void mainDraw(Graphics graphics) {
    // create a function that draws one square and takes 2 parameters:
    // the square size and the graphics
    // and draws a square of that size to the center of the canvas.
    // draw 3 squares with that function.
    // avoid code duplication.
    int size = 200;

    drawRects(size, graphics);


  }

  public static void drawRects(int size, Graphics graphics) {
    Random random = new Random();
    for (int i = 0; i < 3; i++) {
      int randomNumber = random.nextInt(255);
      graphics.setColor(new Color(randomNumber, randomNumber, randomNumber));
      graphics.drawRect(WIDTH - (size / 2), HEIGHT - (size / 2), size, size);
      size = size + randomNumber;
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