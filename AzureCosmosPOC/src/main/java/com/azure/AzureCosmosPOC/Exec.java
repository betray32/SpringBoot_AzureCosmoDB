package com.azure.AzureCosmosPOC;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Automatic Execution
 */
@Component
public class Exec implements CommandLineRunner {

  /**
   * Custom repository
   */
  @Autowired
  private CustomerRepository repository;

  @Override
  public void run(String... args) throws Exception {

    System.out.println("Auto Runner");
    System.out.println("Getting Data...");
    List<User> res = repository.findAll();
    System.out.println("Size = " + res.size());

    for (User u : res) {
      System.out.println("Data " + res);
    }

  }

}
