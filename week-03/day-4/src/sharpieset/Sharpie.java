package sharpieset;

public class Sharpie {

  String color;
  int width;
  int inkAmount = 100;
  boolean usable = true;

  public Sharpie(String color, int width, int inkAmount) {
    this.color = color;
    this.width = width;
    this.inkAmount = inkAmount;
    if (inkAmount == 0) {
      this.usable = false;
    }
  }

  public void use() {
    inkAmount--;
  }

  public void use(int howManyTimes) {
    this.inkAmount -= howManyTimes;
  }
}