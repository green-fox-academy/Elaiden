import java.util.ArrayList;

public class TodoPrint {

  public static void main(String[] args) {

    String todoText = " - Buy milk\n";
    // Add "My todo:" to the beginning of the todoText
    // Add " - Download games" to the end of the todoText
    // Add " - Diablo" to the end of the todoText but with indention

    // Expected output:

    // My todo:
    //  - Buy milk
    //  - Download games
    //      - Diablo

    StringBuilder newTodo = new StringBuilder(todoText);
    newTodo = newTodo.insert(0, "My todo:\n");
    System.out.println(newTodo.lastIndexOf("k"));
    newTodo = newTodo.insert(21, " - Download games\n");
    System.out.println(newTodo.lastIndexOf("s"));
    newTodo = newTodo.insert(39, "\t- Diablo");
    System.out.println(newTodo.lastIndexOf("o"));
    todoText = newTodo.toString();

    System.out.println(todoText);
  }
}
