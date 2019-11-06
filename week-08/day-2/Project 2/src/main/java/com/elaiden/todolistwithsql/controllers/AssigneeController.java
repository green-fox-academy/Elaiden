package com.elaiden.todolistwithsql.controllers;

import com.elaiden.todolistwithsql.models.Assignee;
import com.elaiden.todolistwithsql.services.IAssigneeService;
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

@Controller
@RequestMapping("/assignee")
public class AssigneeController {

  private IAssigneeService iAssigneeService;

  @Autowired
  public AssigneeController(IAssigneeService iAssigneeService) {
    this.iAssigneeService = iAssigneeService;
  }

  @GetMapping({"", "/", "/list"})
  public String assigneeList(Model model) {
    List<Assignee> assigneeList = new ArrayList<>();
    iAssigneeService.findAll().forEach(assigneeList::add);
    model.addAttribute("assignees", assigneeList);
    return "assigneelist";
  }

  @GetMapping("/create")
  public String addNewAssignee(@ModelAttribute(name = "newAssignee") Assignee newAssignee) {
    return "createassignee";
  }

  @PostMapping("/create")
  public String receiveNewAssignee(@ModelAttribute(name = "newAssignee") Assignee newAssignee) {
    iAssigneeService.save(newAssignee);
    return "redirect:/assignee/list";
  }

  @GetMapping("/{id}/edit")
  public String editAssignee(@PathVariable(value = "id") long id,
      Model model) {
    model.addAttribute("editAssignee", iAssigneeService.findById(id));
    return "editassignee";
  }

  @PostMapping("/{id}/edit")
  public String returnEditedAssignee(
      @ModelAttribute(name = "editAssignee") Assignee assigneeToSave) {
    iAssigneeService.save(assigneeToSave);
    return "redirect:/assignee/list";
  }

  @GetMapping("/{id}/delete")
  public String deleteAssignee(@PathVariable(value = "id") long id) {
    iAssigneeService.deleteById(id);
    return "redirect:/assignee/list";
  }
}
