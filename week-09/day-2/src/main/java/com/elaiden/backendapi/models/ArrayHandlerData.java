package com.elaiden.backendapi.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ArrayHandlerData {

  private String what;
  private int[] numbers = {1, 2, 5, 10};

}
