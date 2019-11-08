package com.gfa.programmingfoxclub.controllers;

import com.gfa.programmingfoxclub.services.IDrinkService;
import com.gfa.programmingfoxclub.services.IFoodService;
import com.gfa.programmingfoxclub.services.IFoxService;
import com.gfa.programmingfoxclub.services.ITrickService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/fox")
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

  @GetMapping({"/", ""})
  public String infoWithPet(Model model,
      @RequestParam(value = "name", required = false) String name) {
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

}
