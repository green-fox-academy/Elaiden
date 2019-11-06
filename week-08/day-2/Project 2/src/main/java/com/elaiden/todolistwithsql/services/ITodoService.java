package com.elaiden.todolistwithsql.services;

import com.elaiden.todolistwithsql.models.Todo;
import java.util.List;
import java.util.Optional;

public interface ITodoService {

  List<Todo> findAllByDone(boolean state);
  Iterable<Todo> findAll();
  void save(Todo newTodo);
  void deleteById(long id);
  Optional<Todo> findById(long id);
  List<Todo> findAllByTitleContains(String search);
}
