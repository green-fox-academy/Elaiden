import javax.swing.*;

import java.awt.*;


import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Diagonals {
  public static void mainDraw(Graphics graphics) {
    // Draw the canvas' diagonals.
    // If it starts from the upper-left corner it should be green, otherwise it should be red.
    graphics.setColor(Color.GREEN);
    graphics.drawLine(0, 0, 640, 480);
    graphics.setColor(Color.RED);
    graphics.drawLine(640, 0, 0, 480);

  }

  // Don't touch the code below
  static int WIDTH = 640;
  static int HEIGHT = 480;

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