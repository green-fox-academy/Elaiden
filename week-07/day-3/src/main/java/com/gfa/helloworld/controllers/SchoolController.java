package com.gfa.helloworld.controllers;

import com.gfa.helloworld.services.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SchoolController {

  private StudentServiceImpl studentServiceImpl;

  @Autowired
  public SchoolController(StudentServiceImpl studentServiceImpl) {
    this.studentServiceImpl = studentServiceImpl;
  }

  @GetMapping("/gfa")
  public String gfaContent(Model model) {
    model.addAttribute("studentCounter", studentServiceImpl.countStudents());
    return "gfaHome";
  }

  @GetMapping("/gfa/list")
  public String studentList(Model model) {
    model.addAttribute("studentList", studentServiceImpl.findAll());
    return "gfaStudentlist";
  }

  @GetMapping("/gfa/add")
  public String addNewStudent() {
    return "addStudent";
  }

  @PostMapping("/gfa/save")
  public String saveStudent(@RequestParam(name = "addStudent") String name) {
    studentServiceImpl.save(name);
    return "redirect:/gfa/list";
  }

  @GetMapping("/gfa/check")
  public String checkStudent() {
    return "checkStudent";
  }

  @PostMapping("/gfa/check")
  public String checkAnswer(@RequestParam(name = "checkStudent") String name, Model model) {
    if (studentServiceImpl.findAll().contains(name)) {
      model.addAttribute("queryMessage", name + " is on the list.");
    } else {
      model.addAttribute("queryMessage", name + " isn't on the list.");
    }
    return "checkStudent";
  }
}
