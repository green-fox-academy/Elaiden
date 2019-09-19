import javax.swing.*;

import java.awt.*;


import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
  public static void mainDraw(Graphics graphics) {

    // Project Line Play

    int steps = WIDTH / 16;
    int x1 = 0;
    int y1 = 0;
    int x2 = WIDTH - (WIDTH - steps);
    int y2 = HEIGHT;
    for (int i = 0; i < steps; i++) {
      graphics.setColor(Color.GREEN);
      graphics.drawLine(x1, y1, x2, y2);
      y1 += steps;
      x2 += steps;
    }
    x1 = 0;
    y1 = 0;
    x2 = WIDTH;
    y2 = HEIGHT - (HEIGHT - steps);
    for (int j = 0; j < steps; j++) {
      graphics.setColor(Color.BLUE);
      graphics.drawLine(x1, y1, x2, y2);
      x1 += steps;
      y2 += steps;
    }

  }

  // Don't touch the code below
  static int WIDTH = 640;
  static int HEIGHT = 640;

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