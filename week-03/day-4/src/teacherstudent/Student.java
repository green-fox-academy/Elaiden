package teacherstudent;

public class Student {

  public static void learn() {
    System.out.println("The student is learning something new.");
  }

  public void question() {
    System.out.println("The student is asking a question.");
    Teacher.answer();
  }
}
