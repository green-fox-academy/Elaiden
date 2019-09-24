import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class WriteMultipleLines {

  public static void main(String[] args) {

    // Create a function that takes 3 parameters: a path, a word and a number
    // and is able to write into a file.
    // The path parameter should be a string that describes the location of the file you wish to modify
    // The word parameter should also be a string that will be written to the file as individual lines
    // The number parameter should describe how many lines the file should have.
    // If the word is 'apple' and the number is 5, it should write 5 lines
    // into the file and each line should read 'apple'
    // The function should not raise any errors if it could not write the file.

    writeExtraLines(
        "C:\\Users\\Gabby\\greenfox\\Elaiden\\week-03\\day-2\\file-for-multiplelines.txt", "apple",
        5);
  }

  public static void writeExtraLines(String pathOfFile, String extraContent, int nrOfLines) {
    try {
      Path pathToFile = Paths.get(pathOfFile);
      List<String> contentOfFile = Files.readAllLines(pathToFile);
      for (int i = 0; i < nrOfLines; i++) {
        contentOfFile.add(extraContent);
        Files.write(pathToFile, contentOfFile);
      }
    } catch (IOException e) {

    }
  }
}
