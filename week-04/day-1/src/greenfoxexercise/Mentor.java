package greenfoxexercise;

public class Mentor extends Person {

  private String level;  // junior, intermediate, senior

  public Mentor() {
    super();
    this.setLevel("intermediate");
  }

  public Mentor(String name, int age, String gender, String level) {
    super(name, age, gender);
    this.setLevel(level);
  }

  public void introduce() {
    System.out
        .println(
            "Hi, I'm " + this.getName() + ", a " + this.getAge() + " year old " + this.getGender()
                + " " + level + " mentor.");
  }

  public void getGoal() {
    System.out.println("My goal is: Educate brilliant junior software developers.");
  }

  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }
}
