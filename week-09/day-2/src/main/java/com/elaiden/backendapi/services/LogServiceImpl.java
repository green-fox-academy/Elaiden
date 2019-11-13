package com.elaiden.backendapi.services;

import com.elaiden.backendapi.models.Log;
import com.elaiden.backendapi.repositories.LogRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogServiceImpl implements LogService {

  private LogRepository logRepository;

  @Autowired
  public LogServiceImpl(LogRepository logRepository) {
    this.logRepository = logRepository;
  }

  @Override
  public void saveLog(String endpoint, String data) {
    Log log = new Log(endpoint, data);
    logRepository.save(log);
  }

  @Override
  public List<Log> entries() {
    List<Log> entries = new ArrayList<>();
    logRepository.findAll().forEach(entries::add);
    return entries;
  }
}
