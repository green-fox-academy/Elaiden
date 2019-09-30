package greenfoxexercise;

public class Student extends Person {

  private String previousOrganization;
  private int skippedDays;

  public Student() {
    super();
    this.setPreviousOrganization("The School of Life");
    this.setSkippedDays(0);
  }

  public Student(String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.setPreviousOrganization(previousOrganization);
    this.setSkippedDays(0);
  }

  public String getPreviousOrganization() {
    return previousOrganization;
  }

  public void setPreviousOrganization(String previousOrganization) {
    this.previousOrganization = previousOrganization;
  }

  public int getSkippedDays() {
    return skippedDays;
  }

  public void setSkippedDays(int skippedDays) {
    this.skippedDays = skippedDays;
  }

  public void introduce() {
    System.out.println(
        "Hi, I'm " + this.getName() + ", a " + this.getAge() + " year old " + this.getGender()
            + " from " + previousOrganization
            + " who skipped " + skippedDays + " days from the course already.");
  }

  public void getGoal() {
    System.out.println("My goal is: Be a junior software developer.");
  }

  public void skipDays(int numberOfDays) {
    this.skippedDays += numberOfDays;
  }
}
