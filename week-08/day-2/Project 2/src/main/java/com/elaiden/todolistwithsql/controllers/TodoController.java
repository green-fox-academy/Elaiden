package com.elaiden.todolistwithsql.controllers;

import com.elaiden.todolistwithsql.models.Todo;
import com.elaiden.todolistwithsql.repositories.TodoRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/todo")
public class TodoController {

  private TodoRepository repository;

  @Autowired
  public TodoController(TodoRepository repository) {
    this.repository = repository;
  }

  @GetMapping({"", "/", "/list"})
  public String list(Model model,
      @RequestParam(value = "isActive", required = false) boolean isActive) {
    List<Todo> todoList = new ArrayList<>();
    if (isActive) {
      repository.findAllByDone(false).forEach(todoList::add);
    } else {
      repository.findAll().forEach(todoList::add);
    }
    model.addAttribute("todos", todoList);
    return "todolist";
  }

  @GetMapping("/create")
  public String addNewTodo(@ModelAttribute(name = "newTodo") Todo newTodo) {
    return "createtodo";
  }

  @PostMapping("/create")
  public String receiveNewTodo(@ModelAttribute(name = "newTodo") Todo newTodo) {
    repository.save(newTodo);
    return "redirect:/todo/list";
  }

  @GetMapping("/{id}/delete")
  public String deleteTodo(@PathVariable(value = "id") long id) {
    repository.deleteById(id);
    return "redirect:/todo/list";
  }
}