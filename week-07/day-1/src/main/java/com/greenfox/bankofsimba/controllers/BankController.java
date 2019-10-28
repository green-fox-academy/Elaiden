package com.greenfox.bankofsimba.controllers;

import com.greenfox.bankofsimba.models.BankAccount;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BankController {

  private List<BankAccount> accounts = new ArrayList<>();

  @GetMapping(value = "/show")
  public String showAccount(Model model) {
    BankAccount simba = new BankAccount("Simba", 2000, "lion");
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
    accounts.add(new BankAccount("Simba", 2000, "lion"));
    accounts.add(new BankAccount("Timon", 500, "meerkat"));
    accounts.add(new BankAccount("Pumbaa", 1000, "warthog"));
    accounts.add(new BankAccount("Scar", 20000, "lion"));
    accounts.add(new BankAccount("Nala", 2, "lion"));
    accounts.add(new BankAccount("Mufasa", 30000, "lion"));
    model.addAttribute("accounts", accounts);
    return "showAccounts";
  }

  public void setAccounts(List<BankAccount> accounts) {
    this.accounts = accounts;
  }

  public List<BankAccount> getAccounts() {
    return accounts;
  }
}
