package com.elaiden.redditclone.controllers;

import com.elaiden.redditclone.services.PostServicable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

  private PostServicable postService;

  @Autowired
  public MainController(PostServicable postService) {
    this.postService = postService;
  }

  @GetMapping(value = {"", "/"})
  public String indexPage(Model model) {
    model.addAttribute("postList", postService.showAllDescendingByPoints());
    return "index";
  }
}
