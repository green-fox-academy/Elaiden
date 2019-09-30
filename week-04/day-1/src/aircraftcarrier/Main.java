package aircraftcarrier;

public class Main {

  public static void main(String[] args) {

    Carrier myCarrier = new Carrier(2300, 5000);
    Carrier enemyCarrier = new Carrier(2300, 5000);

    F35 firstF35 = new F35();
    F35 secondF35 = new F35();
    F35 thirdF35 = new F35();
    F16 firstF16 = new F16();
    F16 secondF16 = new F16();

    myCarrier.add(firstF35);
    myCarrier.add(secondF35);
    myCarrier.add(thirdF35);
    myCarrier.add(firstF16);
    myCarrier.add(secondF16);

    enemyCarrier.add(firstF35);
    enemyCarrier.add(secondF35);
    enemyCarrier.add(thirdF35);
    enemyCarrier.add(firstF16);
    enemyCarrier.add(secondF16);

    myCarrier.fill();
    myCarrier.getStatus();

    System.out.println("==========================");
    System.out.println("Fight testing");

    myCarrier.fight(enemyCarrier);
  }
}
