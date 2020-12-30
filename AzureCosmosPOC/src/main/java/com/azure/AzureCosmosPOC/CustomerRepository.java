package com.azure.AzureCosmosPOC;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Implements default methods from db for using cosmos
 */

public interface CustomerRepository extends MongoRepository<User, String> {

}
