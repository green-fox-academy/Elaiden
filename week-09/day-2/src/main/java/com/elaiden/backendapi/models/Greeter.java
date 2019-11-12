package com.elaiden.backendapi.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Greeter {

  private String welcome_message;

  public Greeter(String welcome_message) {
    this.welcome_message = welcome_message;
  }
}
