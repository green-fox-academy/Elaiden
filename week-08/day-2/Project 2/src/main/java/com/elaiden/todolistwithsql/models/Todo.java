package com.elaiden.todolistwithsql.models;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

@Getter
@Setter
@Entity
public class Todo {

  @ManyToOne(cascade = CascadeType.MERGE)
  Assignee assignee;
  @Transient
  private String assigneeId;

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private long id;
  private String title;
  private boolean urgent = false;
  private boolean done = false;
  String date = getDate();
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  String dueDate = getDate();

  public Todo() {
  }

  public Todo(String title, boolean done, boolean urgent) {
    this.title = title;
    this.urgent = urgent;
    this.done = done;
  }

  public void setAssignee(Assignee assignee) {
    assignee.addTodo(this);
    this.assignee = assignee;
  }

  public void removeAssignee() {
    assignee.removeTodo(this);
  }

  public String getDate() {
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    Date date = new Date();
    String formatDate = dateFormat.format(date);
    return formatDate;
  }
}