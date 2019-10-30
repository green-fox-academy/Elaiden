package com.greenfox.bankofsimba.controllers;

import com.greenfox.bankofsimba.models.BankAccount;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BankController {

  private List<BankAccount> accounts = new ArrayList<>();

  public BankController() {
    accounts.add(new BankAccount("Simba", 2000, "lion", true, true));
    accounts.add(new BankAccount("Timon", 500, "meerkat", false, true));
    accounts.add(new BankAccount("Pumbaa", 1000, "warthog", false, true));
    accounts.add(new BankAccount("Scar", 20000, "lion", false, false));
    accounts.add(new BankAccount("Nala", 2, "lion", false, true));
    accounts.add(new BankAccount("Mufasa", 30000, "lion", true, true));
  }

  @GetMapping(value = "/show")
  public String showAccount(Model model) {
    BankAccount simba = new BankAccount("Simba", 2000, "lion", true, true);
    model.addAttribute("account", simba);
    return "showAccounts";
  }

  @GetMapping(value = "/motivate")
  public String motivate(Model model) {
    model.addAttribute("motivationText", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "motivate";
  }

  @GetMapping(value = "/accounts")
  public String showAccounts(Model model) {
    model.addAttribute("accounts", accounts);
    return "showAccounts";
  }

  @GetMapping(value = "/newAccount")
  public String newAccount(@ModelAttribute(name = "newAnimal") BankAccount bankAccount) {
    return "newAccount";
  }

  @PostMapping(value = "/newAccount")
  public String addAccount(@ModelAttribute(name = "newAnimal") BankAccount bankAccount) {
    accounts.add(bankAccount);
    return "redirect:/accounts";
  }

  @PostMapping(value = "/balanceHack")
  public String accountHack(@RequestParam(name = "customersMenu") String name) {
    BankAccount luckyOne = accounts.stream()
        .filter(x -> x.getName().equals(name))
        .collect(Collectors.toList())
        .get(0);
    if (luckyOne.isKing()) {
      luckyOne.setBalance(luckyOne.getBalance() + 100);
    } else {
      luckyOne.setBalance(luckyOne.getBalance() + 10);
    }
    return "redirect:/accounts";
  }

  public void setAccounts(List<BankAccount> accounts) {
    this.accounts = accounts;
  }

  public List<BankAccount> getAccounts() {
    return accounts;
  }
}
