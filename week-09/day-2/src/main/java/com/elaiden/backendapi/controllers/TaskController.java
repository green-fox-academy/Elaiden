package com.elaiden.backendapi.controllers;

import com.elaiden.backendapi.models.Doubling;
import com.elaiden.backendapi.models.Error;
import com.elaiden.backendapi.models.Greeter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

  @GetMapping("/doubling")
  public ResponseEntity getDoubleValue(
      @RequestParam(name = "input", required = false) Integer input) {
    if (input != null) {
      Doubling doubling = new Doubling(input);
      return ResponseEntity.ok().body(doubling);
    } else {
      Error error = new Error();
      error.setError("Please provide an input!");
      return ResponseEntity.status(HttpStatus.OK).body(error);
    }
  }

  @GetMapping("/greeter")
  public ResponseEntity greatAPerson(
      @RequestParam(name = "name", required = false) String name,
      @RequestParam(name = "title", required = false) String title) {
    Error error = new Error();
    if (name == null && title == null) {
      error.setError("Please provide a name and a title!");
      return ResponseEntity.badRequest().body(error);
    } else if (name == null) {
      error.setError("Please provide a name!");
      return ResponseEntity.badRequest().body(error);
    } else if (title == null) {
      error.setError("Please provide a title!");
      return ResponseEntity.badRequest().body(error);
    }
    Greeter greeter = new Greeter("Oh, hi there " + name + ", my dear " + title + "!");
    return ResponseEntity.ok().body(greeter);
  }

}
