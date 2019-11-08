package com.gfa.programmingfoxclub.services;

import com.gfa.programmingfoxclub.models.Food;
import java.util.List;

public interface IFoodService {
  List<Food> findAll();
}
