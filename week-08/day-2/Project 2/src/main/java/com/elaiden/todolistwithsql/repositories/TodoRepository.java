package com.elaiden.todolistwithsql.repositories;

import com.elaiden.todolistwithsql.models.Todo;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {

  List<Todo> findAllByDone(boolean done);
  List<Todo> findAllByTitleContains(String search);
  List<Todo> findAllByDateContains(String search);
  List<Todo> findAllByDueDateContains(String search);
  List<Todo> findAllByAssignee_NameContains(String name);
  List<Todo> findAllByAssignee_Id(long id);
}