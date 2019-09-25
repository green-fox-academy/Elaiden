package sharpie;

public class Sharpie {

  String color;
  float width;
  float inkAmount = 100.00f;

  Sharpie(String color, float width) {
    this.color = color;
    this.width = width;
  }

  public void use() {
    inkAmount--;
  }
}
