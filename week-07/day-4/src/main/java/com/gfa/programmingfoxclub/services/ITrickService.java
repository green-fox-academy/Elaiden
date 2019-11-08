package com.gfa.programmingfoxclub.services;

import com.gfa.programmingfoxclub.models.Trick;
import java.util.List;

public interface ITrickService {
  List<Trick> findAllByFox_Id(long foxId);
  List<Trick> findAll();
  Trick findByTrickNameEquals(String trickName);
  void save(Trick trick);
}
