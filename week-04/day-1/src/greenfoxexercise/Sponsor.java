package greenfoxexercise;

public class Sponsor extends Person {

  private String company;
  private int hiredStudents;

  public Sponsor() {
    super();
    this.setCompany("Google");
    this.setHiredStudents(0);
  }

  public Sponsor(String name, int age, String gender, String company) {
    super(name, age, gender);
    this.setCompany(company);
    this.setHiredStudents(0);
  }

  public void hire() {
    this.setHiredStudents(hiredStudents++);
  }

  public void introduce() {
    System.out.println(
        "Hi, I'm " + this.getName() + ", a " + this.getAge() + " year old " + this.getGender()
            + " who represents " + this.getCompany()
            + " and hired " + this.getHiredStudents() + " students so far.");
  }

  public void getGoal() {
    System.out.println("My goal is: Hire brilliant junior software developers.");
  }

  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public int getHiredStudents() {
    return hiredStudents;
  }

  public void setHiredStudents(int hiredStudents) {
    this.hiredStudents = hiredStudents;
  }
}
