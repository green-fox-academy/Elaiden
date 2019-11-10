package com.elaiden.redditclone.controllers;

import com.elaiden.redditclone.models.Post;
import com.elaiden.redditclone.services.PostServicable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PostController {

  private PostServicable postService;

  @Autowired
  public PostController(PostServicable postService) {
    this.postService = postService;
  }

  @GetMapping(value = "/submit")
  public String getSubmitPage() {
    return "submit";
  }

  @PostMapping(value = "/submit")
  public String getDataFromSubmit(@ModelAttribute(name = "postTitle") String title,
      @ModelAttribute(name = "postContent") String content) {
    Post post = new Post();
    post.setPostTitle(title);
    post.setPostContent(content);
    postService.save(post);
    return "redirect:/";
  }

  @GetMapping(value = "/{id}/upvote")
  public String upVotePost(@PathVariable(name = "id") long id) {
    postService.findAndIncrement(id);
    return "redirect:/";
  }

  @GetMapping(value = "/{id}/downvote")
  public String downVotePost(@PathVariable(name = "id") long id) {
    postService.findAndDecrement(id);
    return "redirect:/";
  }
}
