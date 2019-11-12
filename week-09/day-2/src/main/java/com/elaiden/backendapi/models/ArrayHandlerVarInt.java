package com.elaiden.backendapi.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ArrayHandlerVarInt {

  int result;

  public int sum(int[] numbers) {
    this.result = 0;
    for (int i = 0; i < numbers.length; i++) {
      this.result += numbers[i];
    }
    return this.result;
  }

  public int multiply(int[] numbers) {
    this.result = 1;
    for (int i = 0; i < numbers.length; i++) {
      this.result *= numbers[i];
    }
    return this.result;
  }

}
