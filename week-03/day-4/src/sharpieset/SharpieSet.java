package sharpieset;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {

  List<Sharpie> sharpieSet = new ArrayList<>();

  public SharpieSet() {

  }

  public int countUsable() {
    int count = 0;
    for (int i = 0; i < sharpieSet.size(); i++) {
      if (sharpieSet.get(i).usable) {
        count++;
      }
    }
    return count;
  }

  public void removeTrash() {
    for (int i = 0; i < sharpieSet.size(); i++) {
      if (!sharpieSet.get(i).usable) {
        sharpieSet.remove(i);
      }
    }
  }
}
