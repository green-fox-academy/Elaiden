package com.gfa.programmingfoxclub.repositories;

import com.gfa.programmingfoxclub.models.Food;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepository extends CrudRepository<Food, Long> {
List<Food> findAll();
}
