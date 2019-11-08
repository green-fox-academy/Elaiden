package com.gfa.programmingfoxclub.services;

import com.gfa.programmingfoxclub.models.Food;
import com.gfa.programmingfoxclub.repositories.FoodRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodServiceImpl implements IFoodService {

  private FoodRepository foodRepository;

  @Autowired
  public FoodServiceImpl(FoodRepository foodRepository) {
    this.foodRepository = foodRepository;
  }

  @Override
  public List<Food> findAll() {
    List<Food> foodList = new ArrayList<>();
    foodRepository.findAll().forEach(foodList::add);
    return foodList;
  }
}
