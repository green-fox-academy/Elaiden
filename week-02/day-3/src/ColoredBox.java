import javax.swing.*;

import java.awt.*;
import sun.plugin2.util.ColorUtil;


import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {
  public static void mainDraw(Graphics graphics) {
    // Draw a box that has different colored lines on each edge.
    graphics.setColor(Color.BLUE);
    graphics.drawRect(25, 25, 300, 300);

    graphics.setColor(new Color(176, 40, 40));
    graphics.drawLine(25, 25, 325, 25);
    graphics.setColor(new Color(118, 95, 24));
    graphics.drawLine(25, 325, 325, 325);
    graphics.setColor(new Color(184, 23, 88));
    graphics.drawLine(25, 25, 25, 325);
    graphics.setColor(new Color(62, 146, 19));
    graphics.drawLine(325, 25, 325, 325);


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