package com.elaiden.iamgroottest.controllers;

import com.elaiden.iamgroottest.models.Arrow;
import com.elaiden.iamgroottest.models.GrootError;
import com.elaiden.iamgroottest.models.Grootilizator;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

  @GetMapping("/groot")
  public ResponseEntity translateMessage(@RequestParam(required = false) String message) {
    if (message == null || message.equals("")) {
      GrootError errorMessage = new GrootError();
      return ResponseEntity.badRequest().body(errorMessage);
    } else {
      Grootilizator translate = new Grootilizator(message);
      return ResponseEntity.ok().body(translate);
    }
  }

  @GetMapping("/yondu")
  public ResponseEntity calculateArrowSpeed(@RequestParam(required = false) Double distance,
      @RequestParam(required = false) Double time) {
    if (distance != null && time != null) {
      Arrow newArrowCalc = new Arrow(distance, time);
      return ResponseEntity.ok().body(newArrowCalc);
    } else {
      return new ResponseEntity(HttpStatus.BAD_REQUEST);
    }
  }
}
