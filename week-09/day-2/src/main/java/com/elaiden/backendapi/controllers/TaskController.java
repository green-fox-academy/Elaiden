package com.elaiden.backendapi.controllers;

import com.elaiden.backendapi.models.Doubling;
import com.elaiden.backendapi.models.Error;
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

}
