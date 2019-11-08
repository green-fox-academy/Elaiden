package com.gfa.programmingfoxclub.services;

import com.gfa.programmingfoxclub.models.Fox;
import com.gfa.programmingfoxclub.repositories.FoxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoxServiceImpl implements IFoxService {

  private FoxRepository foxRepository;

  @Autowired
  public FoxServiceImpl(FoxRepository foxRepository) {
    this.foxRepository = foxRepository;
  }

  @Override
  public Fox findByNameEquals(String name) {
    return foxRepository.findByNameEquals(name);
  }

  @Override
  public void save(Fox fox) {
    foxRepository.save(fox);
  }
}
