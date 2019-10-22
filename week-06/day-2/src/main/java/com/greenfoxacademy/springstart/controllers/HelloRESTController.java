package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

  @GetMapping(value = "/greeting")
  public Greeting greeting(@RequestParam String name) {
    return new Greeting(1, "Hello, " + name);
  }
}