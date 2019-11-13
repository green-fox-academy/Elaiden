package com.elaiden.backendapi.services;

import com.elaiden.backendapi.models.Log;
import java.util.List;

public interface LogService {

  void saveLog(String endpoint, String data);

  List<Log> entries();
}
