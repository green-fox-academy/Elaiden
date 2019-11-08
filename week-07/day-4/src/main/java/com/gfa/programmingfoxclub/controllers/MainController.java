package com.gfa.programmingfoxclub.controllers;

import com.gfa.programmingfoxclub.services.IFoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  private IFoxService foxService;

  @Autowired
  public MainController(IFoxService foxService) {
    this.foxService = foxService;
  }

  @GetMapping(value = {"", "/", "/login"})
  public String loginPage() {
    return "login";
  }

  @PostMapping(value = {"", "/", "/login"})
  public String loginPet(@RequestParam(value = "name") String name, Model model) {
    if (foxService.findByNameEquals(name) == null) {
      model.addAttribute("errorMessage",
          "You have provided a name that has not been used before, add it as a new one!");
      model.addAttribute("errorColor", "red");
      return "login";
    } else {
      return "redirect:/fox?name=" + name;
    }
  }
}