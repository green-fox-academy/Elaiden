package com.elaiden.redditclone.controllers;

import com.elaiden.redditclone.services.PostServicable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MainController {

  private PostServicable postService;

  @Autowired
  public MainController(PostServicable postService) {
    this.postService = postService;
  }

  @GetMapping(value = {"", "/{page}"})
  public String indexPage(Model model,
      @PathVariable(name = "page", required = false) Integer page) {
    if (page == null || page == 0) {
      page = 1;
    }
    model.addAttribute("postList", postService.showAllDescendingPerPage(page));
    model.addAttribute("page", page);
    return "index";
  }
}
