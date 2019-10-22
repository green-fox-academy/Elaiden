package com.greenfoxacademy.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

  private AtomicLong greetCount = new AtomicLong();

  @GetMapping(value = "/greeting")
  public String greeting(@RequestParam String name) {
    greetCount.incrementAndGet();
    return "Hello, " + name + ", the site has been refreshed " + greetCount + " times.";
  }
}