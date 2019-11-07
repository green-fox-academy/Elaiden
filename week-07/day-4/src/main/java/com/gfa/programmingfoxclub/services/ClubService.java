package com.gfa.programmingfoxclub.services;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Service
@Getter
@Setter
public class ClubService {

  public ClubService() {
  }

  /*public Fox catchThisFox(String name) {
    return this.foxClub.stream()
        .filter(fox -> fox.getName().equals(name))
        .collect(Collectors.toList()).get(0);
  }*/
}