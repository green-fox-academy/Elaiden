package aircraftcarrier;

public class Aircraft {

  private String type;
  private int ammoMax;
  private int ammoActual;
  private int baseDamage;

  public Aircraft() {

  }

  public Aircraft(String type) {
    this.setType(type);
    this.setAmmoActual(0);
  }

  public int fight() {
    int ammo = this.getAmmoActual();
    this.setAmmoActual(0);
    return ammo * this.getBaseDamage();
  }

  public int refill(int amount) {
    if (this.getAmmoActual() + amount <= this.getAmmoMax()) {
      this.setAmmoActual(this.getAmmoActual() + amount);
      return 0;
    } else {
      return amount - (this.getAmmoMax() - this.getAmmoActual());
    }
  }

  public void getStatus() {
    System.out
        .println(
            "Type " + this.getType() + ", Ammo: " + this.getAmmoActual() + ", Base Damage: " + this
                .getBaseDamage() + ", All Damage: " + totalDamage());
  }

  public int totalDamage() {
    return this.getAmmoActual() * this.getBaseDamage();
  }

  public boolean isPriority() {
    return false;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public int getAmmoMax() {
    return ammoMax;
  }

  public void setAmmoMax(int ammoMax) {
    this.ammoMax = ammoMax;
  }

  public int getAmmoActual() {
    return ammoActual;
  }

  public void setAmmoActual(int ammoActual) {
    this.ammoActual = ammoActual;
  }

  public int getBaseDamage() {
    return baseDamage;
  }

  public void setBaseDamage(int baseDamage) {
    this.baseDamage = baseDamage;
  }
}
