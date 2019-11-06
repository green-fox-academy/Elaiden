package com.elaiden.todolistwithsql.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Todo {

  @ManyToOne(cascade = CascadeType.ALL)
  Assignee assignee;
  @Transient
  private String assigneeId;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String title;
  private boolean urgent = false;
  private boolean done = false;

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
}