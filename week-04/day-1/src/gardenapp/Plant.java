package gardenapp;

public class Plant {

  private String color;
  private double waterLevel;
  private String type;      // Flower or Tree
  private double absorbRate;

  public Plant() {
    this.setWaterLevel(0);
  }

  public Plant(String color, String type) {
    this.setColor(color);
    this.setType(type);
    this.setWaterLevel(0);
  }

  public double getAbsorbRate() {
    return absorbRate;
  }

  public void setAbsorbRate(double absorbRate) {
    this.absorbRate = absorbRate;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public double getWaterLevel() {
    return waterLevel;
  }

  public void setWaterLevel(double waterLevel) {
    this.waterLevel = waterLevel;
  }
}
