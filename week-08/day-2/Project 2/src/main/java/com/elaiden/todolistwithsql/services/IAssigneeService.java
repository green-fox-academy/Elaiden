package com.elaiden.todolistwithsql.services;

import com.elaiden.todolistwithsql.models.Assignee;

public interface IAssigneeService {

  Iterable<Assignee> findAll();
  void save(Assignee newAssignee);
  void deleteById(long id);
  Assignee findById(long id);
}
