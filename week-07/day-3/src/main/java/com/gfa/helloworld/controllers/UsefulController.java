package com.gfa.helloworld.controllers;

import com.gfa.helloworld.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsefulController {

  private UtilityService utilityService;

  @Autowired
  public UsefulController(UtilityService utilityService) {
    this.utilityService = utilityService;
  }

  @GetMapping("/useful")
  public String getContent() {
    return "useful";
  }

  @GetMapping("/useful/colored")
  public String coloredBackground(Model model) {
    model.addAttribute("randomColor", utilityService.randomColor());
    return "colored";
  }

  @GetMapping("/useful/email")
  public String validateEmail(@RequestParam String email, Model model) {
    if (utilityService.emailValidator(email)) {
      model.addAttribute("emailColor", "green");
    } else {
      model.addAttribute("emailColor", "red");
    }
    model.addAttribute("email", email);
    return "email";
  }

  @GetMapping("useful/encoding")
  public String encodeText(@RequestParam String text, @RequestParam int key, Model model) {
    model.addAttribute("encodedText", utilityService.caesar(text, key));
    return "encoded";
  }

  @GetMapping("useful/decoding")
  public String decodeText(@RequestParam String text, @RequestParam int key, Model model) {
    int decodeKey = -key;
    model.addAttribute("decodedText", utilityService.caesar(text, decodeKey));
    return "decoded";
  }
}
