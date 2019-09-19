import java.util.Random;
import javax.swing.*;

import java.awt.*;


import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
  public static void mainDraw(Graphics graphics) {
    // Draw the night sky:
    //  - The background should be black
    //  - The stars can be small squares
    //  - The stars should have random positions on the canvas
    //  - The stars should have random color (some shade of grey)
    Random randomNum = new Random();
    graphics.setColor(Color.BLACK);
    graphics.fillRect(0, 0, WIDTH, HEIGHT);
    for (int i = 0; i < 50; i++) {
      int colorR = (int) (30 + Math.random() * 70);
      graphics.setColor(new Color(colorR, colorR, colorR));
      for (int j = 0; j < 50; j++) {
        int starX = randomNum.nextInt(WIDTH);
        int starY = randomNum.nextInt(HEIGHT);
        int starS = (int) (Math.random() * 5);
        graphics.fillRect(starX, starY, starS, starS);
      }
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