package com.elaiden.iamgroottest.models;

public class Grootilizator {

  private String received;
  private String translated;

  public Grootilizator() {
  }

  public Grootilizator(String received) {
    this.received = received;
    this.translated = "I am Groot!";
  }

  public String getReceived() {
    return received;
  }

  public void setReceived(String received) {
    this.received = received;
  }

  public String getTranslated() {
    return translated;
  }

  public void setTranslated(String translated) {
    this.translated = translated;
  }
}
