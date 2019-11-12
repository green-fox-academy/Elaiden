package com.elaiden.backendapi.controllers;

import com.elaiden.backendapi.models.AppendA;
import com.elaiden.backendapi.models.ArrayHandlerData;
import com.elaiden.backendapi.models.ArrayHandlerVarArray;
import com.elaiden.backendapi.models.ArrayHandlerVarInt;
import com.elaiden.backendapi.models.DoUntil;
import com.elaiden.backendapi.models.DoUntilData;
import com.elaiden.backendapi.models.Doubling;
import com.elaiden.backendapi.models.Error;
import com.elaiden.backendapi.models.Greeter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

  @GetMapping("/appenda/{appendable}")
  public ResponseEntity appendWordWithA(@PathVariable String appendable) {
    if (appendable == null) {
      return new ResponseEntity(HttpStatus.NOT_FOUND);
    }
    AppendA append = new AppendA(appendable);
    return ResponseEntity.ok().body(append);
  }

  @PostMapping("/dountil/{action}")
  public ResponseEntity doActionUntilSpecified(@PathVariable String action,
      @RequestBody DoUntilData until) {
    if (action.equals("sum")) {
      DoUntil doUntil = new DoUntil();
      doUntil.setResult(doUntil.sum(until.getUntil()));
      return ResponseEntity.ok().body(doUntil);
    } else if (action.equals("factor")) {
      DoUntil doUntil = new DoUntil();
      doUntil.setResult(doUntil.factor(until.getUntil()));
      return ResponseEntity.ok().body(doUntil);
    }
    Error error = new Error("Please provide a number!");
    return ResponseEntity.ok().body(error);
  }

  @PostMapping("/arrays")
  public ResponseEntity operationsOnArrays(@RequestBody ArrayHandlerData arrayData) {
    if (arrayData.getWhat() == null || arrayData.getNumbers() == null
        || arrayData.getNumbers().length == 0) {
      Error error = new Error("Please provide what to do with the numbers!");
      return ResponseEntity.ok().body(error);
    }
    if (arrayData.getWhat().equals("sum")) {
      ArrayHandlerVarInt arraySum = new ArrayHandlerVarInt();
      arraySum.setResult(arraySum.sum(arrayData.getNumbers()));
      return ResponseEntity.ok().body(arraySum);

    } else if (arrayData.getWhat().equals("multiply")) {
      ArrayHandlerVarInt arrayMultiply = new ArrayHandlerVarInt();
      arrayMultiply.setResult(arrayMultiply.multiply(arrayData.getNumbers()));
      return ResponseEntity.ok().body(arrayMultiply);

    } else if (arrayData.getWhat().equals("double")) {
      ArrayHandlerVarArray arrayDoubleValues = new ArrayHandlerVarArray();
      arrayDoubleValues.setResult(arrayDoubleValues.doubleValues(arrayData.getNumbers()));
      return ResponseEntity.ok().body(arrayDoubleValues);

    } else {
      return new ResponseEntity(HttpStatus.BAD_REQUEST);
    }
  }
}
