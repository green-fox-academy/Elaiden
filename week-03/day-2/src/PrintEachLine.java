import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class PrintEachLine {

  public static void main(String[] args) {
    // Write a program that opens a file called "my-file.txt", then prints
    // each line from the file.
    // If the program is unable to read the file (for example it does not exist),
    // then it should print the following error message: "Unable to read file: my-file.txt"

    // Path myTextPath = Paths.get("my-file.txt");
    try {
      List<String> linesOfMyText = Files.readAllLines(
          Paths.get("C:\\Users\\Gabby\\greenfox\\Elaiden\\week-03\\day-2\\my-file.txt"));
      for (String actualLine : linesOfMyText) {
        System.out.println(actualLine);
      }
    } catch (IOException ex) {
      System.out.println("Unable to read file: my-file.txt");
    }
  }
}