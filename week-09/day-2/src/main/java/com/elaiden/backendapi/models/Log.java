package com.elaiden.backendapi.models;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Logs")
public class Log {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  @CreatedDate
  private Date createdAt = new Date();
  private String endpoint;
  private String data;

  public Log(String endpoint, String data) {
    this.endpoint = endpoint;
    this.data = data;
  }
}
