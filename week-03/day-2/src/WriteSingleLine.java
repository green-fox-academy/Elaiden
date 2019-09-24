import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class WriteSingleLine {

  public static void main(String[] args) {
    // Write a function that is able to manipulate a file
    // By writing your name into it as a single line
    // The file should be named "my-file.txt"
    // In case the program is unable to write the file,
    // It should print the following error message: "Unable to write file: my-file.txt"

    writeMyName("C:\\Users\\Gabby\\greenfox\\Elaiden\\week-03\\day-2\\my-file.txt");
  }

  public static void writeMyName(String fileName) {
    try {
      Path reachTheFile = Paths.get(fileName);
      List<String> contentOfFile = Files.readAllLines(reachTheFile);
      contentOfFile.add("Gabor Horvath");
      Files.write(reachTheFile, contentOfFile);
    } catch (IOException e) {
      System.out.println("Unable to write file: my-file.txt");
    }
  }
}