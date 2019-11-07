package com.elaiden.todolistwithsql.controllers;

import com.elaiden.todolistwithsql.models.Assignee;
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

  private ITodoService todoService;
  private IAssigneeService assigneeService;

  @Autowired
  public TodoController(ITodoService todoService, IAssigneeService assigneeService) {
    this.todoService = todoService;
    this.assigneeService = assigneeService;
  }

  @GetMapping({"", "/", "/list"})
  public String list(Model model,
      @RequestParam(value = "isActive", required = false) boolean isActive) {
    List<Todo> todoList = new ArrayList<>();
    List<Assignee> workers = new ArrayList<>();
    assigneeService.findAll().forEach(workers::add);
    if (isActive) {
      todoList.addAll(todoService.findAllByDone(false));
    } else {
      todoService.findAll().forEach(todoList::add);
    }
    model.addAttribute("todos", todoList);
    model.addAttribute("workers", workers);
    return "todolist";
  }

  @GetMapping("/create")
  public String addNewTodo(@ModelAttribute(name = "newTodo") Todo newTodo) {
    return "createtodo";
  }

  @PostMapping("/create")
  public String receiveNewTodo(@ModelAttribute(name = "newTodo") Todo newTodo) {
    todoService.save(newTodo);
    return "redirect:/todo/list";
  }

  @GetMapping("/{id}/delete")
  public String deleteTodo(@PathVariable(value = "id") long id) {
    todoService.findById(id).removeAssignee();
    todoService.deleteById(id);
    return "redirect:/todo/list";
  }

  @GetMapping("/{id}/edit")
  public String editTodo(@PathVariable(value = "id") long id,
      Model model) {
    model.addAttribute("editTodo", todoService.findById(id));
    model.addAttribute("assignees", assigneeService.findAll());
    return "edittodo";
  }

  @PostMapping("/{id}/edit")
  public String returnEditedTodo(@ModelAttribute(name = "editTodo") Todo todoToSave) {
    todoToSave.setAssignee(assigneeService.findById(Long.parseLong(todoToSave.getAssigneeId())));
    todoService.save(todoToSave);
    return "redirect:/todo/list";
  }

  @PostMapping("/search")
  public String searchTodo(Model model, @RequestParam(name = "search") String search) {
    List<Todo> todoList = new ArrayList<>();
    todoService.findAllByTitleContains(search).forEach(todoList::add);
    todoService.findAllByDateContains(search).forEach(todoList::add);
    todoService.findAllByDueDateContains(search).forEach(todoList::add);
    todoService.findAllByAssignee_NameContains(search).forEach(todoList::add);
    model.addAttribute("todos", todoList);
    return "todolist";
  }
}