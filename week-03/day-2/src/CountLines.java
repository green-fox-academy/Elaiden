import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {

  public static void main(String[] args) {

    // Write a function that takes a filename as string,
    // then returns the number of lines the file contains.
    // It should return zero if it can't open the file, and
    // should not raise any error.

    String fileToFind = "C:\\Users\\Gabby\\greenfox\\Elaiden\\week-03\\day-2\\my-file.txt";
    countTheNumbers(fileToFind);
  }

  public static void countTheNumbers(String aFile) {
    int lineCounter = 0;
    try {
      Path findTheFile = Paths.get(aFile);
      List<String> contentOfFile = Files.readAllLines(findTheFile);
      for (int row = 0; row < contentOfFile.size(); row++) {
        lineCounter++;
      }
    } catch (IOException e) {
      System.out.println("");
    }
    System.out.println(lineCounter);
  }
}
