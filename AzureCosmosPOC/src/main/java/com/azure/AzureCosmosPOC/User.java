package com.azure.AzureCosmosPOC;

import org.springframework.data.annotation.Id;

/**
 * Entity 'USER' created in cosmos db (mongo)
 */
public class User {

  @Id
  private String id;
  private String name;
  private Long age;

  @Override
  public String toString() {
    return "UserCosmos{" +
        "_id='" + id + '\'' +
        ", name='" + name + '\'' +
        ", age=" + age +
        '}';
  }
}
