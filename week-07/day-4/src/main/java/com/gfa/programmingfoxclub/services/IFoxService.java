package com.gfa.programmingfoxclub.services;

import com.gfa.programmingfoxclub.models.Fox;

public interface IFoxService {
  public Fox findByNameEquals(String name);
  void save(Fox fox);
}
