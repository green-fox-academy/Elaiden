package com.elaiden.todolistwithsql.controllers;

import com.elaiden.todolistwithsql.models.Todo;
import com.elaiden.todolistwithsql.repositories.TodoRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todo")
public class TodoController {

  private TodoRepository repository;

  @Autowired
  public TodoController(TodoRepository repository) {
    this.repository = repository;
  }

  @GetMapping({"", "/", "/list"})
  public String list(Model model) {
    List<Todo> todoList = new ArrayList<>();
    repository.findAll().forEach(todoList::add);
    model.addAttribute("todos", todoList);
    return "todolist";
  }
}