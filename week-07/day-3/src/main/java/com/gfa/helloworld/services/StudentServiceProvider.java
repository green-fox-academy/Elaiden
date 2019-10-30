package com.gfa.helloworld.services;

import java.util.List;

public interface StudentServiceProvider {

  public List<String> findAll();

  public void save(String student);

  public int countStudents();

}
