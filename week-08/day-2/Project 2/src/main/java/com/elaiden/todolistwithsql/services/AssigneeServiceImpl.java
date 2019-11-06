package com.elaiden.todolistwithsql.services;

import com.elaiden.todolistwithsql.models.Assignee;
import com.elaiden.todolistwithsql.repositories.AssigneeRepository;
import java.util.Optional;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Getter
@Setter
public class AssigneeServiceImpl implements IAssigneeService {

  private AssigneeRepository assigneeRepository;

  @Autowired
  public AssigneeServiceImpl(
      AssigneeRepository assigneeRepository) {
    this.assigneeRepository = assigneeRepository;
  }

  @Override
  public Iterable<Assignee> findAll() {
    return assigneeRepository.findAll();
  }

  @Override
  public void save(Assignee newAssignee) {
    assigneeRepository.save(newAssignee);
  }

  @Override
  public void deleteById(long id) {
    assigneeRepository.deleteById(id);
  }

  @Override
  public Optional<Assignee> findById(long id) {
    return assigneeRepository.findById(id);
  }
}
