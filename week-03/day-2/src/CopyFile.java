import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CopyFile {

  public static void main(String[] args) {

    // Write a function that copies the contents of a file into another
    // It should take the filenames as parameters
    // It should return a boolean that shows if the copy was successful

    copyAFileIntoAnother("C:\\Users\\Gabby\\greenfox\\Elaiden\\week-03\\day-2\\copyFileA.txt",
        "C:\\Users\\Gabby\\greenfox\\Elaiden\\week-03\\day-2\\copyFileB.txt");
  }

  public static void copyAFileIntoAnother(String origin, String target) {
    boolean writeSuccesful = true;
    try {
      Path firstFile = Paths.get(origin);
      Path secondFile = Paths.get(target);
      List<String> firstContent = Files.readAllLines(firstFile);
      List<String> secondContent = Files.readAllLines(secondFile);
      secondContent.add(firstContent.toString());
      Files.write(secondFile, firstContent);
      System.out.println(writeSuccesful);
    } catch (IOException e) {
      System.out.println(!writeSuccesful);
    }
  }
}
