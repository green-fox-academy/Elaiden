package com.elaiden.todolistwithsql.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Todo {

  public Todo() {
  }

  public Todo(String title, boolean done, boolean urgent) {
    this.title = title;
    this.urgent = urgent;
    this.done = done;
  }

  @Id
  @GeneratedValue
  private long id;
  private String title;
  private boolean urgent = false;
  private boolean done = false;
}