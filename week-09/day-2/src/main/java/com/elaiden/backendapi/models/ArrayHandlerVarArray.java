package com.elaiden.backendapi.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ArrayHandlerVarArray {

  int[] result = new int[4];

  public int[] doubleValues(int[] numbers) {
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = numbers[i] * 2;
    }
    return numbers;
  }
}