package com.gfa.programmingfoxclub.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Trick {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String trickName;

  @ManyToOne(cascade = CascadeType.ALL)
  Fox fox;

  public Trick(Fox fox) {
    this.fox = fox;
  }

  public Trick(String trickName) {
    this.trickName = trickName;
  }
}
