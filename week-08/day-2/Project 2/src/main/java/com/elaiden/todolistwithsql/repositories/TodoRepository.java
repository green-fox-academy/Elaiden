package com.elaiden.todolistwithsql.repositories;

import com.elaiden.todolistwithsql.models.Todo;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
  List<Todo> findAllByDone(boolean state);
}