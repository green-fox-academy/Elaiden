package com.gfa.programmingfoxclub.repositories;

import com.gfa.programmingfoxclub.models.Drink;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface DrinkRepository extends CrudRepository<Drink, Long> {
List<Drink> findAll();
}
