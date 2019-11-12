package com.elaiden.backendapi.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Doubling {

  int received;
  int result;

  public Doubling(int received) {
    this.received = received;
    this.result = received * 2;
  }
}
