package com.gfa.programmingfoxclub.services;

import com.gfa.programmingfoxclub.models.Trick;
import com.gfa.programmingfoxclub.repositories.TrickRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrickServiceImpl implements ITrickService {

  private TrickRepository trickRepository;

  @Autowired
  public TrickServiceImpl(TrickRepository trickRepository) {
    this.trickRepository = trickRepository;
  }

  @Override
  public List<Trick> findAllByFox_Id(long foxId) {
    List<Trick> tricks = new ArrayList<>();
    if (trickRepository.findAllByFox_Id(foxId) != null) {
      trickRepository.findAllByFox_Id(foxId).forEach(tricks::add);
      return tricks;
    }
    return null;
  }
}
