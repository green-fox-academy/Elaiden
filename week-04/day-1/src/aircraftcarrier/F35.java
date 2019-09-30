package aircraftcarrier;

public class F35 extends Aircraft {

  public F35() {
    super("F35");
    this.setAmmoMax(12);
    this.setBaseDamage(50);
  }

  @Override
  public boolean isPriority() {
    return true;
  }
}
