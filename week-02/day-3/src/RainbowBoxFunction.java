import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

import java.awt.*;


import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
  public static void mainDraw(Graphics graphics) {
    // Create a square drawing function that takes 3 parameters:
    // The square size, the fill color, graphics
    // and draws a square of that size and color to the center of the canvas.
    // Create a loop that fills the canvas with rainbow colored squares (red, orange, yellow, green, blue, indigo, violet).
    int size = 20;
    ArrayList<Color> colors = new ArrayList<>();
    colors.add(Color.RED);
    colors.add(Color.ORANGE);
    colors.add(Color.YELLOW);
    colors.add(Color.GREEN);
    colors.add(Color.BLUE);
    colors.add(Color.PINK);
    colors.add(Color.BLACK);


    rainbowRects(size, colors, graphics);

  }

  public static void rainbowRects(int size, ArrayList<Color> colors, Graphics graphics) {
    Random newR = new Random();
    int x = (WIDTH / 2) - (size / 2);
    int y = (HEIGHT / 2) - (size / 2);
    for (int i = 0; i < 320; i++) {
      int randomC = newR.nextInt(7);
      graphics.setColor(colors.get(randomC));
      graphics.drawRect(x, y, size, size);
      x = (WIDTH / 2 - 1) - (size / 2 - 1);
      y = (HEIGHT / 2 - 1) - (size / 2 - 1);
      size += 2;
    }
  }

  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 320;

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