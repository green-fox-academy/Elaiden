package counter;

public class Counter {

  int count = 0;
  int manualValue;

  Counter() {

  }

  Counter(int counterToStartWith) {
    this.manualValue = counterToStartWith;
    this.count = this.manualValue;
  }

  public void add() {
    count++;
  }

  public void add(int numberToAddToCount) {
    this.count += numberToAddToCount;
  }

  public int get() {
    return count;
  }

  public void reset() {
    if (manualValue != 0) {
      count = manualValue;
    } else {
      count = 0;
    }
  }
}
