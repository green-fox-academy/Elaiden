package com.elaiden.backendapi.models;

import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class LogEntries {

  private List<Log> entries;
  private int entry_count;

  public LogEntries(List<Log> entries, int entry_count) {
    this.entries = entries;
    this.entry_count = entry_count;
  }
}
