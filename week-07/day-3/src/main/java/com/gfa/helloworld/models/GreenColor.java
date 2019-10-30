package com.gfa.helloworld.models;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("green")
public class GreenColor implements MyColor {

  @Override
  public void printColor() {
    System.out.println("You see this now in green color, trust me...");
  }
}
