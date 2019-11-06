package com.elaiden.todolistwithsql.services;

import com.elaiden.todolistwithsql.models.Assignee;
import java.util.Optional;

public interface IAssigneeService {

  Iterable<Assignee> findAll();
  void save(Assignee newAssignee);
  void deleteById(long id);
  Optional<Assignee> findById(long id);
}
