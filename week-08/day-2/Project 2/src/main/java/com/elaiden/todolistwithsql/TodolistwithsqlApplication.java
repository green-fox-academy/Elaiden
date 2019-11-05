package com.elaiden.todolistwithsql;

import com.elaiden.todolistwithsql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodolistwithsqlApplication implements CommandLineRunner {

  TodoRepository repository;

  @Autowired
  public TodolistwithsqlApplication(TodoRepository repository) {
    this.repository = repository;
  }

  public static void main(String[] args) {
    SpringApplication.run(TodolistwithsqlApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
  }
}