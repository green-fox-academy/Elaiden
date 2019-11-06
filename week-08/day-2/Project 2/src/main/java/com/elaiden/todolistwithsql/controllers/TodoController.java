package com.elaiden.todolistwithsql.controllers;

import com.elaiden.todolistwithsql.models.Todo;
import com.elaiden.todolistwithsql.services.IAssigneeService;
import com.elaiden.todolistwithsql.services.ITodoService;
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

  private ITodoService iTodoService;
  private IAssigneeService iAssigneeService;

  @Autowired
  public TodoController(ITodoService iTodoService, IAssigneeService iAssigneeService) {
    this.iTodoService = iTodoService;
    this.iAssigneeService = iAssigneeService;
  }

  @GetMapping({"", "/", "/list"})
  public String list(Model model,
      @RequestParam(value = "isActive", required = false) boolean isActive) {
    List<Todo> todoList = new ArrayList<>();
    if (isActive) {
      iTodoService.findAllByDone(false).forEach(todoList::add);
    } else {
      iTodoService.findAll().forEach(todoList::add);
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
    iTodoService.save(newTodo);
    return "redirect:/todo/list";
  }

  @GetMapping("/{id}/delete")
  public String deleteTodo(@PathVariable(value = "id") long id) {
    iTodoService.deleteById(id);
    return "redirect:/todo/list";
  }

  @GetMapping("/{id}/edit")
  public String editTodo(@PathVariable(value = "id") long id,
      Model model) {
    model.addAttribute("editTodo", iTodoService.findById(id));
    model.addAttribute("assignees", iAssigneeService.findAll());
    return "edittodo";
  }

  @PostMapping("/{id}/edit")
  public String returnEditedTodo(@ModelAttribute(name = "editTodo") Todo todoToSave) {
    todoToSave.setAssignee(iAssigneeService.findById(Long.parseLong(todoToSave.getAssigneeId())));
    iTodoService.save(todoToSave);
    return "redirect:/todo/list";
  }

  @PostMapping("/search")
  public String searchTodo(Model model, @RequestParam(name = "search") String search) {
    List<Todo> todoList = new ArrayList<>();
    iTodoService.findAllByTitleContains(search).forEach(todoList::add);
    model.addAttribute("todos", todoList);
    return "todolist";
  }
}