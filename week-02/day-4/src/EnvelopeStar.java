import javax.swing.*;

import java.awt.*;


import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
  public static void mainDraw(Graphics graphics) {

    // Project Line Play

    int steps = WIDTH / 2 / 16;
    int middleStartX = WIDTH / 2;
    int middleStartY = steps;
    int rightTargetX = WIDTH / 2;
    int rightTargetY = HEIGHT / 2;
    int leftTargetX = WIDTH / 2;
    int leftTargetY = HEIGHT / 2;
    int middleTargetX = WIDTH / 2;
    int middleTargetY = HEIGHT - steps;
    for (int i = 0; i < steps - 4; i++) {
      graphics.setColor(Color.GREEN);
      graphics.drawLine(middleStartX, middleStartY, rightTargetX, rightTargetY);
      graphics.drawLine(middleStartX, middleStartY, leftTargetX, leftTargetY);
      graphics.drawLine(middleTargetX, middleTargetY, rightTargetX, rightTargetY);
      graphics.drawLine(middleTargetX, middleTargetY, leftTargetX, leftTargetY);
      middleStartY += steps;
      rightTargetX += steps;
      leftTargetX -= steps;
      middleTargetY -= steps;
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