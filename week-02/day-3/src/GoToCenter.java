import java.util.Scanner;
import java.util.Random;
import javax.swing.*;

import java.awt.*;


import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GoToCenter {
  public static void mainDraw(Graphics graphics) {
    // Create a function that draws a single line and takes 3 parameters:
    // The x and y coordinates of the line's starting point and the graphics
    // and draws a line from that point to the center of the canvas.
    // Draw at least 3 lines with that function using a loop.
    Scanner input = new Scanner(System.in);
    System.out.print("Add the starting coordinate \" x \" for the first line: ");
    int x = input.nextInt();
    System.out.print("Add the starting coordinate \" y \" for the first line: ");
    int y = input.nextInt();


    drawLines(x, y, graphics);
  }

  public static void drawLines(int x, int y, Graphics graphics) {
    Random random = new Random();
    int randomNumber = random.nextInt(255);
    for (int i = 0; i < 3; i++) {
      graphics.setColor(new Color(255, randomNumber, randomNumber));
      graphics.drawLine(x, y, WIDTH / 2, HEIGHT / 2);
      x += 100;
      y += 50;
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