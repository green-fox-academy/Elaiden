package com.elaiden.todolistwithsql.services;

import com.elaiden.todolistwithsql.models.Todo;
import com.elaiden.todolistwithsql.repositories.TodoRepository;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Getter
@Setter
public class TodoServiceImpl implements ITodoService {

  private TodoRepository todoRepository;

  @Autowired
  public TodoServiceImpl(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  @Override
  public List<Todo> findAllByDone(boolean state) {
    return todoRepository.findAllByDone(state);
  }

  @Override
  public Iterable<Todo> findAll() {
    return todoRepository.findAll();
  }

  @Override
  public void save(Todo newTodo) {
    todoRepository.save(newTodo);
  }

  @Override
  public void deleteById(long id) {
    todoRepository.deleteById(id);
  }

  @Override
  public Todo findById(long id) {
    return todoRepository.findById(id).orElse(null);
  }

  @Override
  public List<Todo> findAllByTitleContains(String search) {
    return todoRepository.findAllByTitleContains(search);
  }

  @Override
  public List<Todo> findAllByDateContains(String search) {
    return todoRepository.findAllByDateContains(search);
  }

  @Override
  public List<Todo> findAllByDueDateContains(String search) {
    return todoRepository.findAllByDueDateContains(search);
  }

  @Override
  public List<Todo> findAllByAssignee_NameContains(String name) {
    return todoRepository.findAllByAssignee_NameContains(name);
  }
}
