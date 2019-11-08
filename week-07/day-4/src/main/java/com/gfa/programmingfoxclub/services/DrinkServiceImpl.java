package com.gfa.programmingfoxclub.services;

import com.gfa.programmingfoxclub.repositories.DrinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DrinkServiceImpl implements IDrinkService {

  private DrinkRepository drinkRepository;

  @Autowired
  public DrinkServiceImpl(DrinkRepository drinkRepository) {
    this.drinkRepository = drinkRepository;
  }
}
