import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {

  public static void main(String[] args) {
    // Create a method that decrypts the duplicated-chars.txt

    decryptTheZen("C:\\Users\\Gabby\\greenfox\\Elaiden\\week-03\\day-2\\duplicated-chars.txt");

  }

  public static void decryptTheZen(String filePath) {
    try {
      Path originalFile = Paths.get(filePath);
      Path targetFile = Paths
          .get("C:\\Users\\Gabby\\greenfox\\Elaiden\\week-03\\day-2\\decrypted-chars.txt");
      List<String> linesOfFile = Files.readAllLines(originalFile);
      List<String> linesOfTargetFile = new ArrayList<>();
      for (int i = 0; i < linesOfFile.size(); i++) {
        String newText = "";
        for (int j = 0; j < linesOfFile.get(i).length(); j++) {
          if (j % 2 != 0) {
            newText += linesOfFile.get(i).charAt(j);
          }
        }
        linesOfTargetFile.add(newText);
      }
      Files.write(targetFile, linesOfTargetFile);

    } catch (IOException e) {

    }
  }
}