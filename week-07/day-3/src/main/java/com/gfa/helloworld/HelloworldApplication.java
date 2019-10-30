package com.gfa.helloworld;

import com.gfa.helloworld.models.MyColor;
import com.gfa.helloworld.services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloworldApplication implements CommandLineRunner {

  private Printer printer;
  private MyColor myColor;

  @Autowired
  public HelloworldApplication(Printer printer, @Qualifier("red") MyColor myColor) {
    this.printer = printer;
    this.myColor = myColor;
  }

  public static void main(String[] args) {
    SpringApplication.run(HelloworldApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    myColor.printColor();
    printer.log("Siker?!");
  }
}