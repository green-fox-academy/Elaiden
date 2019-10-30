package com.gfa.helloworld.models;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("blue")
public class BlueColor implements MyColor {

  @Override
  public void printColor() {
    System.out.println("You see this now in blue color, trust me...");
  }
}
