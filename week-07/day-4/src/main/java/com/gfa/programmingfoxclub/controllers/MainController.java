package com.gfa.programmingfoxclub.controllers;

import com.gfa.programmingfoxclub.services.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  private ClubService clubService;

  @Autowired
  public MainController(ClubService clubService) {
    this.clubService = clubService;
  }

  /*@GetMapping("/")
  public String infoWithPet(Model model,
      @RequestParam(value = "name", required = false) String name) {
    if (name == null) {
      return "redirect:/login";
    } else if (clubService.getFoxClub().stream().noneMatch(x -> x.getName().equals(name))) {
      return "redirect:/login";
    } else {
      Fox queriedFox = clubService.catchThisFox(name);
      model.addAttribute("foxName", queriedFox.getName());
      model.addAttribute("foxFood", queriedFox.getFood());
      model.addAttribute("foxDrink", queriedFox.getDrink());
      model.addAttribute("foxTricksAmount", queriedFox.getTricks().size());
      model.addAttribute("foxTricks", queriedFox.getTricks());
      return "index";
    }
  }*/

  @GetMapping("/login")
  public String loginPage() {
    return "login";
  }

  /*@PostMapping("/login")
  public String loginPet(@RequestParam(value = "name") String name, Model model) {
    if (clubService.getFoxClub().stream().anyMatch(fox -> fox.getName().equals(name))) {
      return "redirect:/?name=" + name;
    } else {
      model.addAttribute("errorMessage",
          "You have provided a name that has not been used before, add it as a new one!");
      model.addAttribute("errorColor", "red");
      return "login";
    }
  }*/

  /*@GetMapping("/nutritionStore")
  public String nutritionShow(Model model, @RequestParam(value = "name") String name) {
    Fox queriedFox = clubService.catchThisFox(name);
    model.addAttribute("queriedFox", queriedFox);
    model.addAttribute("foodList", clubService.getFood());
    model.addAttribute("drinkList", clubService.getDrink());
    return "nutrition";
  }*/

  @PostMapping("/nutritionStore")
  public String changeNutrition(@RequestParam(value = "name") String name) {
    return "redirect:/?name=" + name;
  }
}