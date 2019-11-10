package com.elaiden.redditclone.models;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Post {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private int postScore = 0;
  private String postTitle;
  private String postContent;
  @CreatedDate
  @DateTimeFormat(pattern = "yyyy-MM-DD")
  private Date datePosted = new Date();

  public void upVote() {
    this.postScore++;
  }

  public void downVote() {
    this.postScore--;
  }
}