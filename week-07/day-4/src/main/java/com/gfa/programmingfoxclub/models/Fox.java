package com.gfa.programmingfoxclub.models;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Fox {

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "id")
  Food foodForThem;
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "id")
  Drink drinkForThem;
  @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  @JoinColumn(name = "id")
  List<Trick> tricks;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String name;
  private String food;
  private String drink;

  public Fox(Food foodForThem, Drink drinkForThem) {
    this.drinkForThem = drinkForThem;
    this.foodForThem = foodForThem;
    tricks = new ArrayList<>();
  }

  public Fox(String name, String food, String drink) {
    this.name = name;
    this.food = food;
    this.drink = drink;
  }
}