package greenfoxexercise;

public class Person {

  private String name;
  private int age;
  private String gender;  // male, female


  public Person() {
    this.setName("Jane Doe");
    this.setAge(30);
    this.setGender("female");
  }

  public Person(String name, int age, String gender) {
    this.setName(name);
    this.setAge(age);
    this.setGender(gender);
  }

  public void introduce() {
    System.out.println(
        "Hi, I'm " + this.getName() + ", a " + this.getAge() + " year old " + this.getGender()
            + ".");
  }

  public void getGoal() {
    System.out.println("My goal is: Live for the moment!");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }
}
