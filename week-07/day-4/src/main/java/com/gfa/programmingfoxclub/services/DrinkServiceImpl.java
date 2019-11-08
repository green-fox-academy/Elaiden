package com.gfa.programmingfoxclub.services;

import com.gfa.programmingfoxclub.models.Drink;
import com.gfa.programmingfoxclub.repositories.DrinkRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DrinkServiceImpl implements IDrinkService {

  private DrinkRepository drinkRepository;

  @Autowired
  public DrinkServiceImpl(DrinkRepository drinkRepository) {
    this.drinkRepository = drinkRepository;
  }

  @Override
  public List<Drink> findAll() {
    List<Drink> drinkList = new ArrayList<>();
    drinkRepository.findAll().forEach(drinkList::add);
    return drinkList;
  }
}
