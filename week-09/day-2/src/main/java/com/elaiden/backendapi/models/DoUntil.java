package com.elaiden.backendapi.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DoUntil {

  private int result;

  public int sum(int number) {
    this.result = 0;
    for (int i = number; i > 0; i--) {
      this.result += i;
    }
    return this.result;
  }

  public int factor(int number) {
    this.result = 1;
    for (int i = number; i > 0; i--) {
      this.result *= i;
    }
    return this.result;
  }
}
