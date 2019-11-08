package com.gfa.programmingfoxclub.services;

import com.gfa.programmingfoxclub.repositories.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodServiceImpl implements IFoodService {

  private FoodRepository foodRepository;

  @Autowired
  public FoodServiceImpl(FoodRepository foodRepository) {
    this.foodRepository = foodRepository;
  }
}
