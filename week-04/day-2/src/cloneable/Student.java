package cloneable;

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

  @Override
  protected Object clone() {
    return new Student(this.getName(), this.getAge(), this.getGender(),
        this.getPreviousOrganization());
  }

  public void setPreviousOrganization(String previousOrganization) {
    this.previousOrganization = previousOrganization;
  }

  public String getPreviousOrganization() {
    return previousOrganization;
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
}