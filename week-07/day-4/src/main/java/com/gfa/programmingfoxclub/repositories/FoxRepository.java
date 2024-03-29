package com.gfa.programmingfoxclub.repositories;

import com.gfa.programmingfoxclub.models.Fox;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoxRepository extends CrudRepository<Fox, Long> {
  Fox findByNameEquals(String name);
}
