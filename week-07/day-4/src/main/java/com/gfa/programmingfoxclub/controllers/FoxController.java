package com.gfa.programmingfoxclub.controllers;

import com.gfa.programmingfoxclub.models.Fox;
import com.gfa.programmingfoxclub.models.Trick;
import com.gfa.programmingfoxclub.services.IDrinkService;
import com.gfa.programmingfoxclub.services.IFoodService;
import com.gfa.programmingfoxclub.services.IFoxService;
import com.gfa.programmingfoxclub.services.ITrickService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FoxController {

  private IFoxService foxService;
  private IFoodService foodService;
  private IDrinkService drinkService;
  private ITrickService trickService;

  @Autowired
  public FoxController(IFoxService foxService,
      IFoodService foodService, IDrinkService drinkService,
      ITrickService trickService) {
    this.foxService = foxService;
    this.foodService = foodService;
    this.drinkService = drinkService;
    this.trickService = trickService;
  }

  @GetMapping(value = "/fox")
  public String infoWithPet(Model model,
      @RequestParam(name = "name", required = false) String name) {
    if (name == null) {
      return "redirect:/login";
    } else if (foxService.findByNameEquals(name) == null) {
      return "redirect:/login";
    } else {
      model.addAttribute("queriedFox", foxService.findByNameEquals(name));
      model.addAttribute("tricks",
          trickService.findAllByFox_Id(foxService.findByNameEquals(name).getId()));
      return "index";
    }
  }

  @GetMapping(value = "/fox/nutrition")
  public String nutritionShow(Model model, @RequestParam(name = "name") String name) {
    model.addAttribute("foxToChangeNutrition", foxService.findByNameEquals(name));
    model.addAttribute("foodList", foodService.findAll());
    model.addAttribute("drinkList", drinkService.findAll());
    return "nutrition";
  }

  @PostMapping(value = "/fox/nutrition")
  public String changeNutrition(@RequestParam(name = "name") String name,
      @RequestParam(name = "allFood") String food, @RequestParam(name = "allDrink") String drink) {
    Fox fox = foxService.findByNameEquals(name);
    fox.setFood(food);
    fox.setDrink(drink);
    foxService.save(fox);
    return "redirect:/fox?name=" + fox.getName();
  }

  @GetMapping(value = "/fox/trickCenter")
  public String showTrickCenter(Model model, @RequestParam(name = "name") String name) {
    Fox fox = foxService.findByNameEquals(name);
    model.addAttribute("chosenFox", fox);
    model.addAttribute("tricks", trickService.findAll());
    return "trickcenter";
  }

  @PostMapping(value = "/fox/trickCenter")
  public String learnNewTrick(@RequestParam(name = "name") String name,
      @RequestParam(name = "trickOption") String trick) {
    Fox fox = foxService.findByNameEquals(name);
    Trick trickToLearn = trickService.findByTrickNameEquals(trick);
    trickToLearn.setFox(fox);
    trickService.save(trickToLearn);
    return "redirect:/fox?name=" + fox.getName();
  }
}
