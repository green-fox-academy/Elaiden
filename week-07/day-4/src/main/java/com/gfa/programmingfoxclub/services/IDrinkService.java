package com.gfa.programmingfoxclub.services;

import com.gfa.programmingfoxclub.models.Drink;
import java.util.List;

public interface IDrinkService {
  List<Drink> findAll();
}
