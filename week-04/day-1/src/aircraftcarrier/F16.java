package aircraftcarrier;

public class F16 extends Aircraft {

  public F16() {
    super("F16");
    this.setAmmoMax(8);
    this.setBaseDamage(30);
  }

  @Override
  public boolean isPriority() {
    return false;
  }
}
