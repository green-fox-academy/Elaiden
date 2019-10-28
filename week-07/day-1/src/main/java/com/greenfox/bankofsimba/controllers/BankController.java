package com.greenfox.bankofsimba.controllers;

import com.greenfox.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BankController {

  @GetMapping(value = "/show")
  public String showAccount(Model model) {
    BankAccount simba = new BankAccount("Simba", 2000, "lion");
    model.addAttribute("account", simba);
    return "account";
  }

  @GetMapping(value = "/motivate")
  public String motivate(Model model) {
    model.addAttribute("motivationText", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "motivate";
  }

}
