package com.gfa.programmingfoxclub.services;

import com.gfa.programmingfoxclub.models.Trick;
import java.util.List;

public interface ITrickService {
  List<Trick> findAllByFox_Id(long foxId);
}
