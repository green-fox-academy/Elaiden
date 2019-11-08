package com.gfa.programmingfoxclub.repositories;

import com.gfa.programmingfoxclub.models.Trick;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrickRepository extends CrudRepository<Trick, Long> {

  List<Trick> findAllByFox_Id(long foxId);
}
