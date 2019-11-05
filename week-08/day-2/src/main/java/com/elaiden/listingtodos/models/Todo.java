package com.elaiden.listingtodos.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Todo {

  public Todo(String title) {
    this.title = title;
  }

  @Id
  @GeneratedValue
  private long id;
  private String title;
  private boolean urgent = false;
  private boolean done = false;
}
