package greenfoxexercise;

import java.util.ArrayList;
import java.util.List;

public class Cohort {

  private String name;
  private List<Student> students;
  private List<Mentor> mentors;

  public Cohort() {

  }

  public Cohort(String name) {
    this.setName(name);
    students = new ArrayList<>();
    mentors = new ArrayList<>();
  }

  public void addStudent(Student student) {
    students.add(student);
  }

  public void addMentor(Mentor mentor) {
    mentors.add(mentor);
  }

  public void info() {
    System.out.println(
        "The " + this.getName() + " cohort has " + students.size() + " students and " + mentors
            .size() + " mentors.");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Student> getStudents() {
    return students;
  }

  public void setStudents(List<Student> students) {
    this.students = students;
  }

  public List<Mentor> getMentors() {
    return mentors;
  }

  public void setMentors(List<Mentor> mentors) {
    this.mentors = mentors;
  }
}
