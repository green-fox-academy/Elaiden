package com.gfa.helloworld;

import com.gfa.helloworld.services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloworldApplication implements CommandLineRunner {

  Printer printer;

  @Autowired
  public HelloworldApplication(Printer printer) {
    this.printer = printer;
  }

  public static void main(String[] args) {
    SpringApplication.run(HelloworldApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    printer.log("Siker?!");
  }
}
